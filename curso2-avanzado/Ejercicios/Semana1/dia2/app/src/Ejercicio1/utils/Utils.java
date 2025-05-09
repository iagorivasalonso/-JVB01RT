package Ejercicio1.utils;

public class Utils {


    public static void cargarDatos(String[] nombres, String elementoBuscado) {

        boolean lleno = true;

        for (int i = 0; i < nombres.length; i++) {

            if(nombres[i] == null)
            {
                nombres[i] = elementoBuscado;
                lleno = false;
                break;
            }
        }

        if(lleno)
            System.err.println("no se pudo añadir porque estammos completos");
    }

    public static String getElement(String[] vector, int posicion ) {

        return vector[posicion];
    }

}
