package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VueloServicio implements IVueloServicio {

    private List<Vuelo> vuelos;

    public VueloServicio (){
        this.vuelos = new ArrayList<>();                      //carga de datos
        vuelos.add(new Vuelo(1, "H001-V", "Iberia", "Madrid", "Buenos Aires", LocalDate.of(2025, 3, 10), LocalDate.of(2025, 3, 11)));
        vuelos.add(new Vuelo(2, "H002-V", "Air France", "París", "Ciudad de México", LocalDate.of(2025, 4, 5), LocalDate.of(2025, 4, 6)));
        vuelos.add(new Vuelo(3, "H003-V", "Lufthansa", "Berlín", "Nueva York", LocalDate.of(2025, 5, 12), LocalDate.of(2025, 5, 12)));
        vuelos.add(new Vuelo(4, "H004-V", "American Airlines", "Miami", "Lima", LocalDate.of(2025, 6, 20), LocalDate.of(2025, 6, 21)));
        vuelos.add(new Vuelo(5, "H005-V", "LATAM", "Santiago", "São Paulo", LocalDate.of(2025, 7, 1), LocalDate.of(2025, 7, 1)));
    }

    @Override
    public List<VueloDTO> todosLosVuelos() {
        return this.vuelos.stream()                                         //Lista todos los vuelos
                .map(this::mapeoVueloToDTO).toList();
    }

    @Override
    public VueloDTO busquedaVuelo(int id) {                                 //Busqueda de vuelo por Id
        Optional<Vuelo> vueloBuscado = this.vuelos.stream().filter(v -> v.getId() ==id).findFirst();
        return vueloBuscado.map(this::mapeoVueloToDTO).orElse(null);            //realiza el mapeo
    }

    @Override
    public List<VueloDTO> insertarVuelos(VueloDTO v) {                            //insertarVuelos
        v.setId(this.vuelos.size() + 1);

        Vuelo vObj = this.mapeoVueloToObJ(v); //mapea a obj
        this.vuelos.add(vObj);
        return this.todosLosVuelos();
    }


    @Override                                                                             //actualizarVuelo
    public ResponseEntity<VueloDTO> actualizarVuelo(int id, VueloDTO vueloActualizado) {

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
            return ResponseEntity.ok(mapeoVueloToDTO(vueloObj));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @Override
    public ResponseEntity<?> eliminarVuelo(int id) {                                             //elimina el vuelo
        boolean eliminado = this.vuelos.removeIf(v -> v.getId() == id);

        if (eliminado)
        {
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(null);
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(null);
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
