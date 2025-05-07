package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc;
        CRUD cr = new CRUD();

        int opcion = 0;
        boolean err = false;

        do {
            sc = new Scanner(System.in);
            System.out.println("¿Que desea hacer?\n\n" +
                    "1. Agregar un cliente\n"+
                    "2. Listar todos los clientes\n"+
                    "3. Actualizar información de un cliente\n"+
                    "4. Eliminar un cliente\n"+
                    "5. Buscar a un cliente por ciudad\n"+
                    "0. Salir\n");


                try {
                    opcion = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.err.println("No es un numero");
                    err = true;
                }

                if (opcion < 0 || opcion > 5)
                {
                    System.err.println("Opción no valida");
                }
                else
                {

                    switch (opcion) {
                        case 1:
                            cr.agregarCliente(sc);
                            break;

                        case 2:
                            cr.listarClientes();
                            break;

                        case 3:
                            int Sopcion = subMenu(sc);

                            if(Sopcion!=0)
                            {
                                cr.ActualizarCliente(Sopcion,sc);
                            }

                            break;

                        case 4:
                            cr.EliminarCliente(sc);
                            break;

                        case 5:
                            cr.BuscarPorCiudad(sc);
                            break;
                    }
                }

        }while (opcion!=0 || err == true);


    }

    private static Integer subMenu(Scanner sc) {

        int opcion = 0;
        int opcionValida = 0;
        System.out.println("¿Que dato desea editar?\n\n" +
                "1. Nombre\n" +
                "2. Apellidos\n" +
                "3. Sexo\n" +
                "4. Fecha de nacimiento\n" +
                "5. Telefono\n" +
                "6. Email\n" +
                "0. Volver\n");


        try {
            opcion = sc.nextInt();

            if (opcion < 0 || opcion > 6)
            {
                System.err.println("Opción no valida");
            }
            else
            {
                opcionValida = opcion;
            }

        } catch (InputMismatchException e) {
            System.err.println("No es un numero");
        }

        return opcionValida;
    }
}