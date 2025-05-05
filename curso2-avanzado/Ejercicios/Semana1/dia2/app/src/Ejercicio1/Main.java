package Ejercicio1;

public class Main {
    public static void main(String[] args) {

         String [] nombres = {"Volvo", "BMW", "Ford", "Mazda"};

         mostrarArray(nombres);



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