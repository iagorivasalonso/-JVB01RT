package com.hackaboss.app.services;

import com.hackaboss.app.dtos.VueloDTO;
import com.hackaboss.app.models.Vuelo;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    ///Todo:  =====metodos mapeo DTO====
    @Override
    public VueloDTO mapeoVueloToDTO(Vuelo v) {
        return new VueloDTO(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada());
    }

    @Override
    public Vuelo mapeoVueloToObJ(VueloDTO v) {
        return new Vuelo(v.getId(), v.getNombreVuelo(),v.getEmpresa(),v.getLugarSalida(),v.getLugarLlegada(),v.getFechaSalida(),v.getFechaLlegada());
    }

    @Override
    public List<VueloDTO> mapeoListaVuelosDTO(List<VueloDTO> listaVuelos) {
        List<VueloDTO> listaDTO = new ArrayList<>();
        for(VueloDTO v : listaVuelos)
        {
            listaDTO.add(v);
        }
        return listaDTO;
    }
}
