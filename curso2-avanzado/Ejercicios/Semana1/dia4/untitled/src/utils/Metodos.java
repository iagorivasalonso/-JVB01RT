package utils;

import Entidades.Empleado;
import Exceptions.Excepciones;
import Exceptions.salarioExeption;

import java.util.Scanner;

public class Metodos {

   public static Empleado altaEmpleado(){

        Empleado empleado=new Empleado();

        System.out.println("¿Como se llama el empleado?");
        System.out.println("¿Cual es el salario del empleado?");

        return empleado;
    }
    public static Empleado insertarEmpleado(Scanner sc) throws salarioExeption {

        Excepciones excep = new Excepciones();
        System.out.println("¿Como se llama el empleado?");
        String nombre = sc.next();
        System.out.println("¿Cual es el salario del empleado?");
        double salario = excep.verificarSalario(sc.nextDouble());

        Empleado empleado=new Empleado(nombre,salario);
        return empleado;
    }
    static void salarioCorrecto(){

    }

    static void listarEmpleados(){

    }


}
