package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import com.hackaboss.app.response.VueloRespuesta;
import org.springframework.http.ResponseEntity;

public interface IVueloServicio {

    ResponseEntity<?> todosLosVuelos(String empresa,String lugarLLegada,String fechaLLegada);
    ResponseEntity<?>busquedaVuelo(int id);
    ResponseEntity<?> insertarVuelos(VueloDTO v);;
    ResponseEntity<?> eliminarVuelo(int id);
    VueloDTO mapeoVueloToDTO(Vuelo v);
    Vuelo mapeoVueloToObJ(VueloDTO v);

    ResponseEntity<VueloRespuesta> actualizarVuelo(int id, VueloDTO vueloActualizado);
}
