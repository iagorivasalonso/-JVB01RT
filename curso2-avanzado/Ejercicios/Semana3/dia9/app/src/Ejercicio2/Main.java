package Ejercicio2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Tarea> listaTareas = new ArrayList<>();
        List<SubTarea> listasubTareas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcion = -1;
       do{
           System.out.println("1. Agrega tarea principal");
           System.out.println("2. Visualizar. ");
           System.out.println("0. Salir. ");
           opcion = sc.nextInt();
           sc.nextLine();

           switch (opcion)
           {
               case 1:
                   System.out.println("nombre de la tarea principal");
                   String tarea = sc.nextLine();
                   listaTareas.add(0,new Tarea(tarea));
                   Utils.añadirSubtareas(listasubTareas,tarea,sc);
                   break;

               case 2:
                   for(int i = 0; i < listaTareas.size(); i++)
                   {
                       System.err.println(listaTareas.get(i).getNombre());

                       for(int x = 0; x <listasubTareas.size(); x++ )
                       {
                           System.out.println(listasubTareas.get(x).getNombre());
                       }
                   }
                   break;

           }
           System.out.println("cerrando");
       }while (opcion!=0);


    }
}
