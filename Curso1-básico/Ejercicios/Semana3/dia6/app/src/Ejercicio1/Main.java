package Ejercicio1;
import Ejercicio1.Entidades.Electrodomestico;

public class Main {

    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico(1,"Fagor","aw8","120","gris");
        Electrodomestico electrodomestico2 = new Electrodomestico(2,"Edesa","ed2","115","Blanco");
        Electrodomestico electrodomestico3 = new Electrodomestico(3,"Philips","p2","125","Negro");

        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println(electrodomestico1.toString());
        System.out.println(electrodomestico2.toString());
        System.out.println(electrodomestico3.toString());

        System.out.println(electrodomestico4.getMarca()); //sale los atributos a null

    }
}