package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import org.springframework.http.ResponseEntity;
import java.util.List;

public class VueloServicio implements IVueloServicio {

    private List<Vuelo> vuelos;

    public VueloServicio (){

    }

    @Override
    public List<VueloDTO> todosLosVuelos() {
        return List.of();
    }

    @Override
    public VueloDTO busquedaVuelo(int id) {
        return null;
    }

    @Override
    public VueloDTO insertarVuelos(VueloDTO v) {
        return null;
    }

    @Override
    public ResponseEntity<?> actualizarVuelo(int id) {
        return null;
    }

    @Override
    public ResponseEntity<?> eliminarVuelo(int id) {
        return null;
    }

    @Override
    public VueloDTO mapeoToDTO(Vuelo v) {
        return null;
    }

    @Override
    public Vuelo mapeoToObJ(VueloDTO v) {
        return null;
    }
}
