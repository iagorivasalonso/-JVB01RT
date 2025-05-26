package utils;


import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class operacionesFiltro {

    public static List<Vuelo> filtro(ArrayList<Vuelo> vuelos, List<Vuelo> filtroVuelos, LocalDate FECHADESDE, LocalDate FECHAHASTA) {

        return vuelos.stream()
                .filter(v -> FECHADESDE == null || v.getFechaInicio().isAfter(FECHADESDE))
                .filter(v -> FECHAHASTA == null || v.getFechafin().isBefore(FECHAHASTA))
                .toList();
    }
}
