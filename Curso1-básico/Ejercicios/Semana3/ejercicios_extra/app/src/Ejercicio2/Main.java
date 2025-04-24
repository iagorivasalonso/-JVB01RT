package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba el numero de su dni");

        int numeroDni = teclado.nextInt();

        System.out.println("La letra de su dni es:");


         char letraResultante = calcularLetra(numeroDni);
        System.out.println(letraResultante);
    }

    private static char calcularLetra(int numeroDni) {


        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int calcularLetra = numeroDni%23;

        char letra = letrasDNI[calcularLetra];
        return letra;
    }
}
