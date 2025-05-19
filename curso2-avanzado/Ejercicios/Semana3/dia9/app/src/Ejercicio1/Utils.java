package Ejercicio1;

import java.util.List;

public class Utils {
    public static void ListarCarpeta(Ejercicio1.Directorio directorio, int subDirectorios, List<String> nombreCarpetas, int subDirectoriosVisto) {

        if(subDirectoriosVisto == directorio.getSubdirectorios().size())
        {
            //caso final impresion de nombres
            System.out.println(nombreCarpetas);
        }
        else
        {
            nombreCarpetas.add(directorio.getSubdirectorios().get(subDirectoriosVisto).getName());

            subDirectoriosVisto++;

            ListarCarpeta(directorio,subDirectorios, nombreCarpetas, subDirectoriosVisto);
        }

    }
}
