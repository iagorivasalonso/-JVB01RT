package Ejercicio1;

import java.util.List;

public class ExplorarDirectorios {
    public static void explorarDirectorio(Ejercicio1.Directorio directorio, int profundidad) {

        if(directorio == null)
            return;

        System.out.println("\t".repeat(profundidad)+directorio.getName());
        directorio.getArchivos().forEach(System.out::println);

        if(directorio.getSubdirectorios()!=null)
            directorio.getSubdirectorios().forEach(d-> explorarDirectorio(d,profundidad+1));

    }
}
