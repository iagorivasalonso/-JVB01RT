package ejercicio3;
import java.util.Scanner;

public class ejercicio3 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("vamos a calcular el area de un triangulo");

            System.out.println("¿cual es su base?");
            int base = scanner.nextInt();
            System.out.println("¿cual es su altura?");
            int altura = scanner.nextInt();

            double area = base*altura/2;

            System.out.println("el area es"+area);

        }


}
