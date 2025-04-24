package Ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         char [] posiblesResultados ={'1','X','2'};
         Random aleatorio = new Random(System.currentTimeMillis());

         Scanner teclado = new Scanner(System.in);



        int opcion = 0;

            System.out.println("1. Quiniela \n" +
                    "2. Quiniela con probabilidad \n" +
                    "3. Salir\n" );

            opcion = 2; //teclado.nextInt();

            switch (opcion)
            {
                case 1:
                    for (int i = 0; i < 15; i++)
                    {
                        int numero = aleatorio.nextInt(3);
                        int Nresultado = i + 1;
                        System.out.println("Resultado " + Nresultado +":"+posiblesResultados[numero]);
                    }
                break;


                case 2:

                    System.out.println("quiniela 1 X 2 con la probabilidad de que salga el 1 sea del 60%, la de la X del 30% y la del 2 del 10%");

                   int cantResultados = 15;
                   int Nresultado  = 0;
                   int cant_1 = 0;
                   int cant_2 = 0;
                   int cant_3 = 0;

                    int numeroEscogido = -1;

                    do {
                        int numero = aleatorio.nextInt(3);


                       if (numero == 0 && cant_1 != cantResultados * 60 /100 )
                       {
                           numeroEscogido = numero;
                           cant_1++;
                       }

                        if (numero == 1 && cant_2 != cantResultados * 30 /100)
                        {
                            numeroEscogido = numero;
                            cant_2++;
                        }
                        if (numero == 2 && cant_3 != cantResultados * 10 /100)
                        {
                            numeroEscogido = numero;
                            cant_3++;
                        }



                            Nresultado++;
                        if(numeroEscogido !=-1 && Nresultado <15)
                            System.out.println("Resultado " + Nresultado +":"+posiblesResultados[numeroEscogido]);



                    } while (cant_1 != cantResultados * 60 /100 || cant_2 !=cantResultados * 30 /100 || cant_3 != cantResultados * 10 /100);



                break;
            }


    }
}