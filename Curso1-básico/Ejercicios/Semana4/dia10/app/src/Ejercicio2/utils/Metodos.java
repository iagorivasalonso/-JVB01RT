package Ejercicio2.utils;

import java.time.LocalDate;

public class Metodos {

    public static void bienvenida(){

        System.out.println("Bienvenido al programa");
    }

    public static void fechaActual() {

        System.out.println(LocalDate.now());
    }

    public static void numeroAleatorio() {

        int numero =(int) (Math.random() * 101);

        System.out.println("\nEl numero aleatorio es:");
        System.out.println(numero);
    }

    public static void tablaMultiplicar(int numero) {

        System.out.println("\nLa tabla del "+numero+" es:\n");

        for (int i = 1; i < 11 ; i++)
        {
            int resultado = i * numero;
            System.out.println( numero +" X "+i+" = "+resultado );
        }
    }
}
