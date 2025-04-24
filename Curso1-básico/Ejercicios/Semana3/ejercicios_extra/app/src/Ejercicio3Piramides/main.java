package Ejercicio3Piramides;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int altura = 4;

        int contador = 1;

          do {

              for (int colum = 0 ; colum < altura; colum++)
              {
                  for (int fila = 0 ; fila < contador; fila++)
                  {
                      System.out.print(fila+1);
                  }
                  System.out.println();
                  contador++;
              }

          } while (contador < altura);
    }
}
