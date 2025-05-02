package Ejercicio1;

import Ejercicio1.utils.FechaUtil;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate ida = LocalDate.of(2024,3,18);
        LocalDate vuelta = LocalDate.of(2024,3,20);

        long dias = FechaUtil.calcularDiferenciaDias(ida,vuelta);

        System.out.println("La diferencia de dias son "+dias);

    }
}