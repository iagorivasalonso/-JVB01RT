package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] diasSemama = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        double [] temperaturas= new double[7];
        double contadorTemperaturas = 0;

        for (int i = 0; i < diasSemama.length; i++)
        {
            System.out.println("¿Cual fue la temperadura máxima de "+diasSemama[i]+"?");
            temperaturas[i] = scanner.nextDouble();
            contadorTemperaturas += temperaturas[i];
        }

        double media = contadorTemperaturas/7;

        System.out.println("la temperatura media es de "+media+" grados");
    }
}