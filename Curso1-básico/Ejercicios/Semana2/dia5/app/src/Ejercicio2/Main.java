package Ejercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inserte el numero a verificar si es par o impar");
        int numero = scanner.nextInt();

        String resultado = Operaciones.esPar(numero);
        System.out.println(resultado);
    }
}