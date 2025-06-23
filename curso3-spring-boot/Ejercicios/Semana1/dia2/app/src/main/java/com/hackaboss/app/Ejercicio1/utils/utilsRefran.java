package com.hackaboss.app.Ejercicio1.utils;

import java.util.List;

public class utilsRefran {

    private final List<String> refranes = List.of(
            "Los delfines tienen la capacidad de reconocer y recordar estos silbidos específicos incluso después de mucho tiempo",
            "Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso",
            "Los pulpos tienen tres corazones",
            "Las jirafas solo duermen entre 10 y 20 minutos seguidos",
            "Los patitos nacen sabiendo seguir a su madre gracias a un fenómeno llamado “impronta”"
    );
    public List<String> obtenerTodos() {

        return this.refranes;
    }

    public String obtenerAleatorio() {

        String refranEscogido="";

        int cantidadRefranes = this.refranes.size();

        int numeroAleatorio = (int) (Math.random() * cantidadRefranes);

        refranEscogido = refranes.get(numeroAleatorio);

        return refranEscogido;
    }
}
