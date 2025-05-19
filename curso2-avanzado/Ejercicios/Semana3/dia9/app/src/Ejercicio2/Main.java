package Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Tarea> listaTareas = new ArrayList<>();

       listaTareas.add(
               new Tarea("Diseño de la aplicacion",
                       Arrays.asList(
                                    new SubTarea("Crear prototipo"),
                                    new SubTarea("Diseño de interfaz",
                                           Arrays.asList(
                                                    new SubTarea("Definir esquema colores"),
                                                    new SubTarea("Diseño responsive")
                                                )
                                           ),
                                           new SubTarea("Documentar requisios")
                                    )


               )
       );

       listaTareas.add(
               new Tarea("Implementar Codigo",
                       Arrays.asList(
                               new SubTarea("Desarrollo backend",
                                       Arrays.asList(
                                               new SubTarea("configurar base de datos"),
                                               new SubTarea("crear logica negocios")
                                       )),
                               new SubTarea("Desarrollo frontend",
                                       Arrays.asList(
                                               new SubTarea("codificar interfaz usuario"),
                                               new SubTarea("integrar con backend")
                                       ))

                       )
               )
               );
       listaTareas.add(
               new Tarea("Pruebas y depuracion",
               Arrays.asList(
                       new SubTarea("Crear prototipo"),
                       new SubTarea("Desarrollo backend",
                               Arrays.asList(
                                       new SubTarea("pruevas de integracion"),
                                       new SubTarea("Soluucion de errores")
                               )),

                       new SubTarea("Documentar requisios")

               )
         )
       );
     int tActual=0;
     int tTareas = listaTareas.size();
        System.out.println(tTareas);
     Utils.ListarTareas(listaTareas, tActual, tTareas);

    }
}
