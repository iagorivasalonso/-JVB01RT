package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es su nombre?");
        String nombre = scanner.nextLine();

        String resultado = Saludos.hola(nombre);

        System.out.println(resultado);

    }
}