package Ejercicio2;

import Ejercicio2.utils.Metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;


        do{

            imprimirMenu();

            try{
                opcion = scanner.nextInt();
            } catch (Exception e){
                System.out.println("Operacion no valida");
                scanner.next();
                continue;
            }


            if(opcion >-1 && opcion < 5)
            {
                System.out.println("La opcion escogida es " +opcion);

                switch (opcion)
                {
                    case 0:
                        System.out.println("adios");
                        break;

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

    private static void imprimirMenu() {

        System.out.println("\nSeleccionar opción: \n\n" +
                "1. Bienvenida \n" +
                "2. Fecha actual \n" +
                "3. Numero aleatorio entre 1 y 100 \n" +
                "4. Tabla del 5 \n" +
                "0. Salir");


    }
}