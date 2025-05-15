import entityes.Auto;

import java.util.*;

public class Utils {
    public static Auto crearAuto(Scanner sc) {

        System.out.println("¿De que marca es el auto?");
        String marca = sc.next();
        System.out.println("¿De que modelo es el auto?");
        String modelo = sc.next();
        System.out.println("¿De que año es el auto?");
        int anho = 0;
        try {
            anho = sc.nextInt();
        }catch (InputMismatchException ex){
            System.err.println("Error");
        }

        System.out.println("¿De que marca es el precio?");
        double precio =0;
        try {
            precio = sc.nextDouble();
        }catch (InputMismatchException ex){
            System.err.println(ex);
        }
         Auto nuevo = new Auto(marca,modelo,anho,precio);
        return nuevo;
    }

    public static void BuscarMarca(Scanner sc, ArrayList<Auto> auto) {

        System.out.println("¿De que marca quiere buscar los autos?");
        String marca_Buscar = sc.next();

        List<Auto> marca = auto.stream().filter(at -> at.getMarca().equalsIgnoreCase(marca_Buscar)).toList();

         if(marca.isEmpty())
         {
             System.out.println("No tiene autos de esta marca");
         }
         else
         {
             System.out.println(marca.toString());
         }


    }

    public static void BuscarAnho(Scanner sc, ArrayList<Auto> auto) {

        System.out.println("¿De que año quiere buscar los autos?");
        int anho_Buscar = sc.nextInt();

        List <Auto> anhoMatriculacion = auto.stream().filter( at -> at.getAnho() == anho_Buscar).toList();

        if(anhoMatriculacion.isEmpty())
        {
            System.out.println("Este año no se matricularon autos");
        }
        else
        {
            System.out.println(anhoMatriculacion.toString());
        }


    }

    public static void calcularValorTotal(ArrayList<Auto> auto) {

        double valorInventario = auto.stream().mapToDouble(Auto::getPrecio).sum();

        System.out.println("el valor del inventario es:"+ valorInventario);
    }
}
