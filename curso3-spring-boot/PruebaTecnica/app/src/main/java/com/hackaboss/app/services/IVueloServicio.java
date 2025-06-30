package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IVueloServicio {

    List<VueloDTO> todosLosVuelos(String empresa,String lugarLLegada,String fechaLLegada);
    VueloDTO busquedaVuelo(int id);
    List<VueloDTO> insertarVuelos(VueloDTO v);;
    ResponseEntity<?> eliminarVuelo(int id);
    VueloDTO mapeoVueloToDTO(Vuelo v);
    Vuelo mapeoVueloToObJ(VueloDTO v);

    ResponseEntity<VueloDTO> actualizarVuelo(int id, VueloDTO vueloActualizado);
}
