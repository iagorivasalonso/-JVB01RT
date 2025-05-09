package Ejercicio1;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws nosepuedereservar{

        Scanner sc = new Scanner(System.in);

        Exepciones excep = new Exepciones();

        int asientosDisponibles = 22;

        String nombre = " ";
        String destino = " ";
        Date fechaViaje = null;
        int asientosDeseados = 0;

        System.out.println("¿cual es su nombre?");
        nombre = excep.validarNoVacio(sc.nextLine());
        System.out.println("¿cual es su destino?");
        destino = excep.validarNoVacio(sc.nextLine());

        System.out.println("¿En que fecha se va formato dd/MM/yyyy?");
        String  fechaTexto = excep.validarNoVacio(sc.nextLine());
        excep.validarFecha(fechaTexto);
        System.out.println("¿Cuantos asientos desea?");

        try {
            asientosDeseados = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("no es un numero Entero");
        }

        if(asientosDeseados > asientosDisponibles)
        {
            throw new nosepuedereservar("no tenemos esa cantidad de asientos");
        }
        else{
            reservaVuelo rv = new reservaVuelo(nombre,destino,fechaViaje,asientosDeseados);
            System.out.println(rv.toString());
        }
        
    }
}
