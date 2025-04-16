package ejercicio4;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos a realizar las 4 operaciones aritmeticas");

        System.out.println("inserte el 1º numero");
        int numero1 = scanner.nextInt();
        System.out.println("inserte el 2º numero");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;
        System.out.println("la suma de "+numero1+ " y " +numero2+ " es igual a "+suma);

        int resta = numero1 - numero2;
        System.out.println("la resta de " +numero1+ " y " +numero2+ " es igual a "+resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("la multiplicacion de " +numero1+ " y " +numero2+ " es igual a "+multiplicacion);

        int division = numero1 / numero2;
        System.out.println("la division de "+numero1+ " y " +numero2+" es igual a "+division);

    }
}
