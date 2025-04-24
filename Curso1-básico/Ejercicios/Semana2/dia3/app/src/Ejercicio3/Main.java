package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una cadena de texto en mayuscula");
        String cadenaMayuscula = scanner.nextLine();
        System.out.println("Ahora escribe una en minusculas");
        String cadenaMinuscula = scanner.nextLine();

        String resultado = Operaciones.conCatenarCacenar(cadenaMayuscula,cadenaMinuscula);

        System.out.println("El resultado es "+resultado);
    }
}