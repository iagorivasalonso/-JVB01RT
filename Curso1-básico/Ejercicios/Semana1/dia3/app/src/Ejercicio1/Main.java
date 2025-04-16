package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el numero 1");
        int numero1 = scanner.nextInt();
        System.out.println("Escriba el numero 2");
        int numero2 = scanner.nextInt();

        int resultado = Operaciones.sumaDosNumeros(numero1, numero2);

        System.out.println("El resultado es "+resultado);

    }
}