package Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Directorio directorioPrincipal = new Ejercicio1.Directorio(1, "documentos", Arrays.asList(
                new Ejercicio1.Directorio(2, "Iago", new ArrayList<Directorio>(), Arrays.asList("foto.jpg", "fotoFamilia.png")),
                new Ejercicio1.Directorio(3, "Curso", new ArrayList<Directorio>(), Arrays.asList("tema1.doc","tema2.doc,evaluacion.doc"))
        ), new ArrayList<String>());

        ExplorarDirectorios.explorarDirectorio(directorioPrincipal,0);

    }
}