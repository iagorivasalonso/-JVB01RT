package Ejercicio2;

import Ejercicio2.utils.Metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = -1;


        do{
            System.out.println("\nSeleccionar opción: \n\n" +
                    "1. Bienvenida \n" +
                    "2. Fecha actual \n" +
                    "3. Numero aleatorio entre 1 y 100 \n" +
                    "4. Tabla del 5 \n" +
                    "0. Salir");

            opcion = scanner.nextInt();

            if(opcion >-1 && opcion < 5)
            {
                System.out.println("La opcion escogida es " +opcion);

                switch (opcion)
                {
                    case 1:
                        Metodos.bienvenida();
                        break;

                    case 2:
                        Metodos.fechaActual();
                        break;

                    case 3:
                        Metodos.numeroAleatorio();
                        break;

                    case 4:
                        int numero=5;
                        Metodos.tablaMultiplicar(numero);
                        break;

                    default:
                        System.out.println("El programa se cerrara");
                        break;
                }
            }
            else
            {
                System.out.println("Opcion incorrecta");
            }

        } while (opcion != 0);


        scanner.close();
    }
}