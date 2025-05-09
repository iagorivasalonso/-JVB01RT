import Entidades.Empleado;
import Exceptions.salarioExeption;
import utils.Metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gestor de empleados \n" +
                "1. añadir empleados \n" +
                "2. cumple con el umbral de salario minimo \n"+
                "3. listar empleados \n");

        int opcion = sc.nextInt();
        ArrayList < Empleado> todos = new ArrayList<>();

        todos.add(new Empleado("empleado 1",1.000));
        todos.add(new Empleado("empleado 2",1.200));
        todos.add(new Empleado("empleado 2",1.300));
        Metodos metodos = new Metodos();

        do{
        switch (opcion)
        {
            case 1:
                Empleado empleado = null;
                try {
                    empleado = Metodos.insertarEmpleado(sc);
                } catch (salarioExeption e) {
                    System.err.println("no puede estar sin cobrar");
                }


                todos.add(empleado);
                break;

            case 2:
                  System.out.println("Inserte el salario minimo de la empresa");



                  try {

                       double salarioMinimo = sc.nextDouble();

                      List<Empleado>  mayorSMI = todos.stream().filter( S ->S.getSalario() > salarioMinimo).toList();

                      if(!mayorSMI.isEmpty())
                      {
                          System.out.println(mayorSMI);
                      }
                      else
                      {
                          System.err.println("No tenemos a nadie con ese salario");
                      }

                  } catch (Exception e){
                      System.err.println("El salario es incorrecto");
                  }


                break;

            case 3:
                      if(todos.isEmpty())
                      {
                          System.err.println("no tiene empleados");
                      }
                      else {
                          todos.forEach(System.out::println);
                      }

                break;
        }

            System.out.println("para volver al menu pulse 1");
            opcion = sc.nextInt();

        } while (opcion == 1);
    }

}