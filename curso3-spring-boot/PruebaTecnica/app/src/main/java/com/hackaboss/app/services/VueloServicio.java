package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import com.hackaboss.app.response.VueloRespuesta;
import com.hackaboss.app.utils.Fechas;
import jakarta.validation.constraints.Max;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class VueloServicio implements IVueloServicio {

    Fechas fechas = new Fechas();

    private List<Vuelo> vuelos;

    public VueloServicio (){

        this.vuelos = new ArrayList<>();                      //carga de datos
        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 3, 10), LocalDate.of(2025, 3, 11)));
        vuelos.add(new Vuelo(2, "H002-V", "Air France", "París", "Lima", LocalDate.of(2025, 4, 5), LocalDate.of(2025, 4, 6)));
        vuelos.add(new Vuelo(3, "H003-V", "Iberia", "Berlín", "Nueva York", LocalDate.of(2025, 5, 12), LocalDate.of(2025, 5, 12)));
        vuelos.add(new Vuelo(4, "H004-V", "American Airlines", "Miami", "Lima", LocalDate.of(2025, 6, 20), LocalDate.of(2025, 6, 21)));
        vuelos.add(new Vuelo(5, "H005-V", "LATAM", "Santiago", "Buenos Aires", LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 1)));
        vuelos.add(new Vuelo(6, "H006-V", "Iberia", "Valencia", "Buenos Aires", LocalDate.of(2025, 8, 10), LocalDate.of(2025, 8, 11)));
        vuelos.add(new Vuelo(7, "H007-V", "LATAM", "Bogotá", "Lima", LocalDate.of(2025, 9, 15), LocalDate.of(2025, 9, 16)));
        vuelos.add(new Vuelo(8, "H008-V", "Air France", "Marsella", "Buenos Aires", LocalDate.of(2025, 10, 5), LocalDate.of(2025, 10, 6)));
        vuelos.add(new Vuelo(9, "H009-V", "American Airlines", "Los Ángeles", "Nueva York", LocalDate.of(2025, 11, 12), LocalDate.of(2025, 11, 13)));
        vuelos.add(new Vuelo(10, "H010-V", "Iberia", "Madrid", "Lima", LocalDate.of(2025, 12, 1), LocalDate.of(2025, 12, 2)));
    }

    @Override
    public ResponseEntity<?> todosLosVuelos(String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada, String ordenarPor) {
        if(this.vuelos==null)
        {
            VueloRespuesta vRespuesta =  new VueloRespuesta(
                    "No tiene ningun vuelo en el sistema.",
                    HttpStatus.NOT_FOUND.value(),
                    LocalDate.now());

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(vRespuesta);
        }
        else
        {
            List<VueloDTO> VuelosFiltrados = this.vuelos.stream()//Lista y filtrado de todos los vuelos
                    .filter(Vuelo -> nombreVuelo == null || Vuelo.getNombreVuelo().equalsIgnoreCase(nombreVuelo))
                    .filter(Vuelo -> empresa == null || Vuelo.getEmpresa().equalsIgnoreCase(empresa))
                    .filter(Vuelo -> lugarSalida == null || Vuelo.getLugarSalida().equalsIgnoreCase(lugarSalida))
                    .filter(Vuelo -> lugarLlegada == null || Vuelo.getLugarLlegada().equalsIgnoreCase(lugarLlegada))
                    .filter(Vuelo -> fechaSalida == null || Vuelo.getFechaSalida().isEqual(fechaSalida))
                    .filter(Vuelo -> fechaLlegada == null || Vuelo.getFechaSalida().isEqual(fechaLlegada))
                    .sorted(Comparator.comparing(Vuelo::getNombreVuelo))
                    .map(this::mapeoVueloToDTO).toList();

            if(VuelosFiltrados.isEmpty())
            {
                VueloRespuesta vRespuesta =  new VueloRespuesta(
                        "No se encontraron vuelos con los filtros proporcionados.",
                        HttpStatus.NOT_FOUND.value(),
                        LocalDate.now()
                );
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(vRespuesta);
            }
            else{
                  if(ordenarPor!=null)
                  {
                      Map<String,List<VueloDTO>> vuelosAgrupados = Map.of();

                      if(ordenarPor.equals("empresa"))  //agrupacion por empresas
                      {
                          vuelosAgrupados = VuelosFiltrados.stream()
                                  .collect(Collectors.groupingBy(VueloDTO::getEmpresa));
                      }
                      if(ordenarPor.equals("lugarLlegada"))                       //agrupacionpor lugarLLegada
                      {

                          vuelosAgrupados = VuelosFiltrados.stream()
                                  .collect(Collectors.groupingBy(VueloDTO::getLugarLlegada));
                      }

                      //la agrupacion lo pasa a list
                      VuelosFiltrados = vuelosAgrupados.values().stream()
                              .flatMap(List::stream)
                              .collect(Collectors.toList());
                  }


                return ResponseEntity.ok(VuelosFiltrados);
            }

        }

    }

    @Override
    public ResponseEntity<?> busquedaVuelo(int id) {                                 //Busqueda de vuelo por Id
        Optional<Vuelo> vueloBuscado = this.vuelos.stream().filter(v -> v.getId() ==id).findFirst();
        if(vueloBuscado.isPresent())
        {
            VueloDTO vDto = mapeoVueloToDTO(vueloBuscado.get());

            return ResponseEntity.ok(vDto);
        }
        else
        {
            VueloRespuesta vRespuesta = new VueloRespuesta(
                    "No se encontro vuelo con el id "+ id,
                    HttpStatus.NOT_FOUND.value(),
                    LocalDate.now()
            );

            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(vRespuesta);
        }

    }

    @Override
    public ResponseEntity<?> insertarVuelos(VueloDTO v) {
        boolean correcto = fechas.comprobarFechas(v.getFechaSalida(),v.getFechaLlegada());// comprobar fechas e insertarVuelos
        if(correcto)
        {
            Vuelo vObj = this.mapeoVueloToObJ(v); //mapea a obj
            this.vuelos.add(vObj);

            VueloRespuesta vueloRespuesta = new VueloRespuesta(
                    "El vuelo se inserto correctamente",
                    HttpStatus.OK.value(),
                    LocalDate.now()
            );
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new VueloRespuesta("La fecha de salida no puede ser antes de la de llegada ",HttpStatus.NO_CONTENT.value(), LocalDate.now()));
        }
        v.setId(vuelos.size() + 1);
        return this.todosLosVuelos(null,null,null, null, null, null, null);
    }


    @Override                                                                             //actualizarVuelo
    public ResponseEntity<VueloRespuesta> actualizarVuelo(int id, VueloDTO vueloActualizado) {

        boolean correcto = fechas.comprobarFechas(vueloActualizado.getFechaSalida(),vueloActualizado.getFechaLlegada());  //comprobar fechas
        if(correcto)
        {
            Vuelo vueloObj = mapeoVueloToObJ(vueloActualizado);                                 //paso a Obj
            vueloObj.setId(id);

            Boolean actualizado = false;

            for (int i = 0; i < vuelos.size(); i++) {
                if (vuelos.get(i).getId() == id) {
                    vuelos.set(i, vueloObj);
                    actualizado = true;
                    break;
                }
            }

            if (actualizado) {

                VueloRespuesta vueloRespuesta = new VueloRespuesta(
                        "El vuelo se actualizo correctamente",
                        HttpStatus.OK.value(),
                        LocalDate.now()
                );

                return ResponseEntity.ok(vueloRespuesta);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new VueloRespuesta("no se encontro el id " + id,HttpStatus.NO_CONTENT.value(), LocalDate.now()));
            }
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new VueloRespuesta("La fecha de salida no puede ser antes de la de llegada",HttpStatus.NO_CONTENT.value(), LocalDate.now()));
        }
    }

    @Override
    public ResponseEntity<VueloRespuesta> eliminarVuelo(int id) {                                             //elimina el vuelo
        boolean eliminado = this.vuelos.removeIf(v -> v.getId() == id);
        if (eliminado)
        {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new VueloRespuesta("Eliminando el id " + id,HttpStatus.ACCEPTED.value(), LocalDate.now()));
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new VueloRespuesta("No se pudo eliminar el id " + id,HttpStatus.NOT_FOUND.value(), LocalDate.now()));
        }
    }

    ///Todo:  =====metodos mapeo DTO====
    @Override
    public VueloDTO mapeoVueloToDTO(Vuelo v) {
        LocalDate fechaSalida = v.getFechaSalida();  //se cojen las fechas y se restan para asi tener la mustra en el json de duracion de viaje
        LocalDate fechaLlegada = v.getFechaLlegada();
        Period periodo = Period.between(fechaSalida,fechaLlegada);
        StringBuilder strTiempo = new StringBuilder(); //Esto nos concatenara si hay dias meses o años

        if(periodo.getYears()!=0)
        {
            strTiempo.append("Años: " + periodo.getYears());
        }
        if(periodo.getMonths()!=0)
        {
            strTiempo.append(" Meses: " + periodo.getMonths());
        }
        if (periodo.getDays()!=0)
        {
            strTiempo.append(" Días: " + periodo.getDays());
        }

        String tiempoViaje = strTiempo.toString();   //se pasa a string
        return new VueloDTO(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada(),tiempoViaje);
    }

    @Override
    public Vuelo mapeoVueloToObJ(VueloDTO v) {
        return new Vuelo(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada());
    }

}
