package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("¿como se llama?");
        String nombre = scanner.nextLine();

        System.out.println("¿cuantos años tiene?");
        int edad = scanner.nextInt();

        if(edad < 18)
        {
            int quedan = 18 - edad;
            System.out.println("no puede acceder al evento tendra que esperar "+quedan+" años ");
        }
        else
        {
            System.out.println("puede acceder al evento");
        }
    }
}