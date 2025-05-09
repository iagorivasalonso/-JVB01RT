package Ejercicio2;

import Ejercicio1.Exepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ejercicio1.Exepciones excep = new Exepciones();
        System.out.println("Añadir producto al inventario\n \n");
        System.out.println("¿Cual es el nombre del producto?");
        String nombre = excep.validarNoVacio(sc.nextLine()) ;
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

        if (cantidadDisponible < 0)
        {
            System.err.println("La cantidad debe de ser mayor a 0");

        } else if (precio < 0.0) {

            System.err.println("El precio debe de ser mayor a 0");
        } else{
            Producto p = new Producto(nombre,precio,cantidadDisponible);

            System.out.println("Producto añadido correctamente");
            System.out.println(p.toString());
        }

    }
}
