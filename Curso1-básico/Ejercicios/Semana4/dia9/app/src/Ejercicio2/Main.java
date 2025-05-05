package Ejercicio2;

import Ejercicio1.Vehiculo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> misProductos = new ArrayList<Producto>();

        Producto producto1 = new Producto(1,"auriculares","siemens","inhalambricos",8,12,4);
        misProductos.add(producto1);
        Producto producto2 = new Producto(2, "teclado", "logitech", "inalámbrico", 15, 25,8);
        misProductos.add(producto2);
        Producto producto3 = new Producto(3, "monitor", "samsung", "24 pulgadas LED", 10, 120,12);
        misProductos.add(producto3);
        Producto producto4 = new Producto(4, "ratón", "genius", "óptico USB", 20, 10,1);
        misProductos.add(producto4);
        Producto producto5 = new Producto(5, "impresora", "hp", "láser multifunción", 5, 200,5);
        misProductos.add(producto5);
        Producto producto6 = new Producto(6, "altavoces", "sony", "2.1 canales", 12, 50,17);
        misProductos.add(producto6);
        Producto producto7 = new Producto(7, "webcam", "logitech", "HD 1080p", 7, 40,9);
        misProductos.add(producto7);
        Producto producto8 = new Producto(8, "micrófono", "blue", "profesional condensador", 9, 80,4);
        misProductos.add(producto8);
        Producto producto9 = new Producto(9, "disco duro", "western digital", "1TB externo", 14, 60,20);
        misProductos.add(producto9);
        Producto producto10 = new Producto(10, "portátil", "lenovo", "i5, 8GB RAM, 256GB SSD", 6, 500,5);
        misProductos.add(producto10);

        double precioVentaMax = Double.MIN_VALUE;
        Producto productoMaxPrecioVenta = null;

        for (Producto prod : misProductos) {

            if (precioVentaMax < prod.getPrecioVenta())
                productoMaxPrecioVenta= prod;
        }

        System.out.println("El producto "+productoMaxPrecioVenta.getNombre()+" Es el producto mas caro");

        double precioCostoMin = Double.MAX_VALUE;
        Producto productoMinStock = null;

        for (Producto prod : misProductos) {

            if (precioCostoMin > prod.getPrecioCosto()){
                precioCostoMin = prod.getPrecioCosto();
                productoMinStock= prod;
            }

        }

        System.out.println("El producto "+productoMinStock.getNombre()+" Es el producto mas barato");
        System.out.println("el  precio mas bajo  de  costo es " +precioCostoMin);

        System.out.println("Todos los productos sin el 5");

        if(misProductos.size() > 5){
            Producto productoEliminado = misProductos.remove(5);
            System.out.println("Se elimino el producto en la posicion 5 " + productoEliminado.getNombre());
        } else {
            System.out.println("No existe producto en la posicion 5");
        }

        int maxStock = Integer.MAX_VALUE;
        Producto productoMaxStock = null;

        for (Producto prod : misProductos) {

            if (precioCostoMin > prod.getPrecioCosto()){
                precioCostoMin = prod.getPrecioCosto();
                productoMaxStock= prod;
            }

        }

        if(productoMaxStock != null)
        {
            productoMaxStock.setCantidadStock(maxStock-3);
            System.out.println("El producto con más stock es " + productoMaxStock.getNombre());
            System.out.println("Nueva cantidad en stock: " + productoMaxStock.getCantidadStock());

        }else{
            System.out.println("no hay productos en el inventario");
        }


    }
}
