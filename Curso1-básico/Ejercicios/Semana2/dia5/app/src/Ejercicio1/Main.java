package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba un numero entero");
        int numero = scanner.nextInt();

        Operaciones.positivoNegativo(numero);
    }
}