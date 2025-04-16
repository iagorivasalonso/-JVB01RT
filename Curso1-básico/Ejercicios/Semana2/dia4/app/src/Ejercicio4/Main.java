package Ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char [][] asientos = new char [5][5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿En que fila quiere sentarse?");
        char asiento = scanner.next().charAt(0);
        System.out.println("¿En que asiento quiere sentarse?");
        char fila = scanner.next().charAt(0);


        for(int f = 0; f < 5; f++)
        {
            for (int a = 0; a < 5; a++)
            {
                asientos[f][a]='O';
            }

        }
        asientos[0][0]= 'X';
        asientos[0][3]= 'X';


        for(int f = 0; f < 5; f++)
        {
            for (int a = 0; a < 5; a++)
            {
                if (asiento != '0' && fila != '0')
                {
                    System.out.println("Esta vacio, queda reservado para usted");
                    asientos[f][a]='X';
                }
                else
                {
                    System.out.println("Ese sitio está ocupado");
                }
                break;
            }
            break;
        }
    }
}