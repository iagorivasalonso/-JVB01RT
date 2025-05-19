package Ejercicio2;

import java.util.List;

public class Utils {
    public static void ListarTareas(List<Tarea> listaTareas, int tActual, int tTareas) {

        if (tActual==tTareas)
        {
            System.out.println("fin");
        }
        else
        {

            if(listaTareas.get(tActual).getSubtareas().get(0).getSubtareas()==null)
            {
                System.out.println(listaTareas.get(tActual).getNombre());
            }
            else
            {

            }

            tActual++;
            ListarTareas(listaTareas,tActual,tTareas);
        }

    }
}
