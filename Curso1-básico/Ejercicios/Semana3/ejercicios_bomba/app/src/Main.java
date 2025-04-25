import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numAleatorio = random.nextInt(10)+1 ;
        System.out.println(numAleatorio);  // Para ver si funciona el Math.random

        int intentosMax=5;
        boolean desactivacion=false;

        System.out.println("Bienvenido al juego de desativar la bomba)");
        System.out.println("Tienes 5 intentos para desactivar la bomba");

        for (int i = 1; i <= intentosMax; i++) {
            System.out.println("Intento nº " + i);
            int numIntentos = scanner.nextInt();

            if(numIntentos==numAleatorio){
                System.out.println("Has acertado. Has desactivado la bomba");
                desactivacion=true;
                break;
            }else {
                System.out.println("Número incorrecto. Prueba otro");
                System.out.println("Te quedan " + (intentosMax -i) + " intentos");
            }

        }
        if(!desactivacion){
            System.out.println("La bomba ha explotado!!");
        }
        scanner.close();
    }
}
