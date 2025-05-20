package Ejercicio2;


import java.util.List;
import java.util.Scanner;

public class Utils {
    public static void añadirSubtareas(List<SubTarea> listSubTareas, String tarea, Scanner sc) {
        while (true)
        {
            System.out.println("¿Desea añadir una subtarea (s/n)?");
            String response = sc.nextLine().trim().toLowerCase();

            if(!response.equals("s"))break;

            System.out.println("¿como se llama?");

            SubTarea subtarea1 = new SubTarea(sc.nextLine());
            listSubTareas.add(subtarea1);
            añadirSubtareas(listSubTareas,tarea,sc);

        }

    }
}
