package ejercicio1;
import java.util.Scanner;

public class ejercicio1 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("por favor ingrese su nombre completo");

            String nombreUsuario = scanner.nextLine();

            System.out.println("hola " +nombreUsuario);

            System.out.println("Â¿Cuantos años tiene?");

            int edad = scanner.nextInt();

            System.out.println("hola " +nombreUsuario+" usted tiene " +edad+" aÃ±os");
        }


}
