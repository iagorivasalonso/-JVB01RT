package Ejercicio3Piramides;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);



        System.out.println("Que tipo de piramide quiere \n \n" +
                "1. Piramide con emoticonos \n" +
                "2. piramide que las filas tengan el numero de la misma \n"+
                "3. piramide que las Columnas tengan el numero de la misma \n"+
                "4. Salir");

        int opcion = teclado.nextInt();

        int altura = 5;
        int contador = 1;

        switch (opcion){
            case 1:

                do {

                    for (int fila = 0 ; fila < altura; fila++)
                    {
                        for (int columna = 0 ; columna < contador; columna++)
                        {

                            System.out.print(" \uD83D\uDE01");
                        }
                        System.out.println();
                        contador++;
                    }


                } while (contador < altura);

                break;

            case 2:

                do {

                    for (int fila = 0 ; fila < altura; fila++)
                    {
                        for (int columna = 0 ; columna < contador; columna++)
                        {
                            System.out.print(fila+1);
                        }
                        System.out.println();
                        contador++;
                    }


                } while (contador < altura);

                break;

            case 3:

                do {

                    for (int fila = 0 ; fila < altura; fila++)
                    {
                        for (int columna = 0 ; columna < contador; columna++)
                        {
                            System.out.print(columna+1);
                        }
                        System.out.println();
                        contador++;
                    }


                } while (contador < altura);

                break;

            default:
                System.out.println("Adios");
                break;
        }
    teclado.close();
    }
}
