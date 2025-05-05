package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es el nombre del producto?");
        String nombre = sc.nextLine();
        System.out.println("¿Cual es el precio del producto?");
        double precio = 0;

        try {
            precio = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("no es un numero Entero");
        }
        System.out.println("¿Cual es la cantidad del producto?");
        int cantidadDisponible = 0;

        try {
            cantidadDisponible = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("no es un numero Entero");
        }


        Producto p = new Producto(nombre,precio,cantidadDisponible);

        System.out.println(p.toString());
    }
}
