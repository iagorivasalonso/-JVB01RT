import entityes.Auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Auto> inventario = new ArrayList<Auto>();

        InventarioAutos.agregar(inventario, new Auto("renault", "modus", 2007, 12.000));
        InventarioAutos.agregar(inventario, new Auto("citroen", "Saxo", 2002, 13.000));
        InventarioAutos.agregar(inventario, new Auto("citroen", "Xara", 2002, 15.000));

        List<Auto> citroen  = InventarioAutos.buscarPor(inventario, a -> a.getMarca().equalsIgnoreCase("citroen"));
        System.out.println("autos citroen"+citroen);

        List<Auto> autonho  = InventarioAutos.buscarPor(inventario, a -> a.getAnho()==2002);
        System.out.println("autos año 2002"+autonho);

        //falta algo

       double suma =InventarioAutos.sumaElementos(inventario, a -> a.getPrecio());

        System.out.println("La suma es " +suma);
    }
}