package Ejercicio1.utils;

import java.time.LocalDate;
import java.time.Period;

public class FechaUtil {

    public static String calcularDiferenciaDias(LocalDate fecha1, LocalDate fecha2) {


        String diferenciaDias = ""+ Period.between(fecha1, fecha2);

        return diferenciaDias;
    }

}
