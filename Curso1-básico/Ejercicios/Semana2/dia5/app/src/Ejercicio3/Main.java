package Ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] nombres = new String[3];

        for (int i = 0; i < nombres.length; i++)
        {
            int numeroPersona = i + 1;
            System.out.println("¿Cual es el nombre de la persona " +numeroPersona+" ?");
            nombres[i] = scanner.nextLine();
        }

        Mostrar.mostrarNombres(nombres);
    }
}