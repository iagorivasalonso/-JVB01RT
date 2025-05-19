package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Directorio directorio = null;

        Directorio misArchivos = new Ejercicio1.Directorio(1, "documentos", Arrays.asList(
                new Ejercicio1.Directorio(2, "Iago", new ArrayList<>(), Arrays.asList("foto.jpg", "fotoFamilia.png")),
                new Ejercicio1.Directorio(3, "Curso", new ArrayList<>(), Arrays.asList("tema1.doc","tema2.doc,evaluacion.doc"))
        ), new ArrayList<>());

        directorio = misArchivos;                //vemos cuantos subdirectorios tenemos
        int subdirectorios = directorio.getSubdirectorios().size();
        int subdirectoriosVisto = 0;   //aqui ponemos los q estan vistos
        List<String> nombreCarpetas = new ArrayList<>();
        Utils.ListarCarpeta(directorio, subdirectorios,nombreCarpetas,subdirectoriosVisto);

    }
}