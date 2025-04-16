package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion =0;
        double contador =0;
        do {
            System.out.println("1. añadir precios de productos");
            System.out.println( "0. finalizar");

            opcion = scanner.nextInt();

            if(opcion != 0)
            {
                System.out.println("¿cual es el precio del producto?");
                double precio = scanner.nextDouble();
                contador += precio;

                System.out.println("por ahora lleva gastados "+contador+" euros");
            }


        } while (opcion !=0);

        if(contador==0)
        {
            System.out.println("Gracias por su visita");
        }
        else
        {
            System.out.println("Gracias por su compra, ha gastado  "+contador+" euros");
        }

    }
}