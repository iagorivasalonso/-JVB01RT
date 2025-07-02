package com.hackaboss.app.utils;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Fechas {


    public boolean comprobarFechas(LocalDate fechaSalida, LocalDate fechaLlegada) {

        return fechaSalida.isBefore(fechaLlegada);
    }
}
