package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;

public interface IVueloServicio {

    ResponseEntity<?> todosLosVuelos(String nombreVuelo, String empresa, String LugarSalida, String lugarLlegada, LocalDate fechaSalida, LocalDate fechaLlegada, String ordenarPor);
    ResponseEntity<?>busquedaVuelo(int id);
    ResponseEntity<?> insertarVuelos(VueloDTO v);;
    ResponseEntity<?> eliminarVuelo(int id);

    ResponseEntity<VueloRespuesta> actualizarVuelo(int id, VueloDTO vueloActualizado);

    VueloDTO mapeoVueloToDTO(Vuelo v);
    Vuelo mapeoVueloToObJ(VueloDTO v);
}
