package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class VueloServicio implements IVueloServicio {

    private List<Vuelo> vuelos;

    public VueloServicio (){

        this.vuelos = new ArrayList<>();                      //carga de datos
        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 3, 10), LocalDate.of(2025, 3, 11)));
        vuelos.add(new Vuelo(2, "H002-V", "Air France", "París", "Ciudad de México", LocalDate.of(2025, 4, 5), LocalDate.of(2025, 4, 6)));
        vuelos.add(new Vuelo(3, "H003-V", "Iberia", "Berlín", "Nueva York", LocalDate.of(2025, 5, 12), LocalDate.of(2025, 5, 12)));
        vuelos.add(new Vuelo(4, "H004-V", "American Airlines", "Miami", "Lima", LocalDate.of(2025, 6, 20), LocalDate.of(2025, 6, 21)));
        vuelos.add(new Vuelo(5, "H005-V", "LATAM", "Santiago", "Buenos Aires", LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 1)));

    }

    @Override
    public ResponseEntity<?> todosLosVuelos(String empresa,String lugarLLegada,String fechaLLegada) {

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
            List<VueloDTO> VuelosFiltrados = this.vuelos.stream()                                         //Lista y filtrado de todos los vuelos
                    .filter(Vuelo -> empresa == null || Vuelo.getEmpresa().equalsIgnoreCase(empresa))
                    .filter(Vuelo -> lugarLLegada == null || Vuelo.getLugarLlegada().equalsIgnoreCase(lugarLLegada))
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
    public ResponseEntity<?> insertarVuelos(VueloDTO v) {                            //insertarVuelos
        v.setId(vuelos.size() + 1);

        Vuelo vObj = this.mapeoVueloToObJ(v); //mapea a obj
        this.vuelos.add(vObj);
        return this.todosLosVuelos(null,null,null);
    }


    @Override                                                                             //actualizarVuelo
    public ResponseEntity<VueloRespuesta> actualizarVuelo(int id, VueloDTO vueloActualizado) {

        Vuelo vueloObj= mapeoVueloToObJ(vueloActualizado);                                 //paso a Obj
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

    @Override
    public ResponseEntity<?> eliminarVuelo(int id) {                                             //elimina el vuelo
        boolean eliminado = this.vuelos.removeIf(v -> v.getId() == id);

        if (eliminado)
        {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(new VueloRespuesta("Eliminando el id " + id,HttpStatus.ACCEPTED.value(), LocalDate.now()));
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new VueloRespuesta("No se pudo eliminar el id " + id,HttpStatus.NO_CONTENT.value(), LocalDate.now()));
        }

    }

    ///Todo:  =====metodos mapeo DTO====
    @Override
    public VueloDTO mapeoVueloToDTO(Vuelo v) {
        return new VueloDTO(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada());
    }

    @Override
    public Vuelo mapeoVueloToObJ(VueloDTO v) {
        return new Vuelo(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada());
    }

}
