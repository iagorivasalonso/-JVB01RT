package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] asientos = new String[5][5];
        Scanner scanner = new Scanner(System.in);

        for (int f = 0; f < 5; f++) {
            for (int a = 0; a < 5; a++) {
                asientos[f][a] = "O";
            }

        }

        int salir = 0;
        do {
            verAsientos(asientos);

            System.out.println("¿En que fila quiere sentarse?");
            int asiento = scanner.nextInt() - 1;
            System.out.println("¿En que asiento quiere sentarse?");
            int fila = scanner.nextInt() - 1;


            if (asientos[fila][asiento].equals("O")) {
                System.out.println("Esta vacio, queda reservado para usted");
                asientos[fila][asiento] = "X";
            } else {
                System.out.println("Ese sitio está ocupado");
            }

            verAsientos(asientos);
            System.out.println("para salir pulse 0");
            salir = scanner.nextInt();


        } while (salir != 0);
    }

    private static void verAsientos(String[][] asientos) {


        for (int f = 0; f < 5; f++) {
            for (int a = 0; a < 5; a++) {
                System.out.print(asientos[f][a]);
            }
            System.out.println("");
        }


    }

}