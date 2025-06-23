package com.hackaboss.app.Ejercicio2.utils;

import java.util.List;

public class utilsDatoCurioso {

    private final List<String> datosCuriosos = List.of(
            "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo",
            "Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso",
            "Los pulpos tienen tres corazones",
            "Las jirafas solo duermen entre 10 y 20 minutos seguidos",
            "Las jirafas solo duermen entre 10 y 20 minutos seguidos"
    );
    public List<String> obtenerTodos() {

        return this.datosCuriosos;
    }

    public String obtenerAleatorio() {

        String datoCuriosoEscogido ="";

        int cantidadDatosCuriosos = this.datosCuriosos.size();

        int numeroAleatorio = (int) (Math.random() * cantidadDatosCuriosos);

        datoCuriosoEscogido = datosCuriosos.get(numeroAleatorio);

        return datoCuriosoEscogido;
    }
}
