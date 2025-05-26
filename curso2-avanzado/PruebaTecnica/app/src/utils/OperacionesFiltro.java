package utils;


import entities.Vuelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperacionesFiltro {

    //funcion de filtro de vuelos
    public static List<Vuelo> filtro(ArrayList<Vuelo> vuelos, List<Vuelo> filtroVuelos, LocalDate FECHADESDE, LocalDate FECHAHASTA) {

        return vuelos.stream()
                .filter(v -> FECHADESDE == null || v.getFechaInicio().isAfter(FECHADESDE))
                .filter(v -> FECHAHASTA == null || v.getFechafin().isBefore(FECHAHASTA))
                .toList();
    }

    //ordenar vuelos por fecha de salida
     public static List<Vuelo> ordenar (List<Vuelo> filtroVuelos){

        List<Vuelo> vuelosOrdenados = null;

         vuelosOrdenados = filtroVuelos.stream().sorted(Comparator.comparing(Vuelo::getFechaInicio)).collect(Collectors.toList());

        return vuelosOrdenados;
     }
}
