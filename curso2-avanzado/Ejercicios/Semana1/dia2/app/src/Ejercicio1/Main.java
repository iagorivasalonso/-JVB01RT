package Ejercicio1;

import Ejercicio1.utils.Utils;

public class Main {
    public static void main(String[] args) {
        int cantidadArray = 4;
         String [] nombres = new String[cantidadArray];

        String nombre1 = "Vlvo";

        Utils.cargarDatos(nombres,"volvo");
        Utils.cargarDatos(nombres,"Renault");
        Utils.cargarDatos(nombres,"Citroen");
        Utils.cargarDatos(nombres,"Seat");
        Utils.cargarDatos(nombres,"Mercedes");
        comprueba(nombres,nombre1);
        int pos= 1;

        try{
            System.out.println("Elemento seleccionado"+Utils.getElement(nombres,11));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("No existe la posicion");
        }

         
    }



    private static void comprueba(String[] nombres, String nombre1) {

        boolean encontrado = false;

        for(int i = 0; i < nombres.length ; i++)
        {
            if(nombres[i].equals(nombre1))
            {
                encontrado = true;
            }
        }


        if(encontrado == false)
        {
            System.err.println("no se encontro");
        }
        else
        {
            System.out.println("nosotros trabajamos con esa marca");
        }
    }

    private static void mostrarArray(String[] nombres) {

        try{

            for(int i = 0; i < 5 ; i++)
            {
                System.out.println(nombres[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // throw new RuntimeException(e);
            System.err.println("No se puede acceder a la posicion");
        }

    }
}