package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IVueloServicio {

    List<VueloDTO> todosLosVuelos();
    VueloDTO busquedaVuelo(int id);
    VueloDTO insertarVuelos(VueloDTO v);
    ResponseEntity<?> actualizarVuelo(int id);
    ResponseEntity<?> eliminarVuelo(int id);
    VueloDTO mapeoVueloToDTO(Vuelo v);
    Vuelo mapeoVueloToObJ(VueloDTO v);

    List<VueloDTO>mapeoListaVuelosDTO(List<VueloDTO>listaVuelos);




}
