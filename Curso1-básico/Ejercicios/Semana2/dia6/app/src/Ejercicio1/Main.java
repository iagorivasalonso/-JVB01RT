package Ejercicio1;
import Ejercicio1.Entidades.Electrodomestico;

public class Main {

    public static void main(String[] args) {

        Electrodomestico electrodomestico1 = new Electrodomestico("Fagor","aw8","120");
        Electrodomestico electrodomestico2 = new Electrodomestico("Edesa","ed2","115");
        Electrodomestico electrodomestico3 = new Electrodomestico("Philips","p2","125");

        Electrodomestico electrodomestico4 = new Electrodomestico();

        System.out.println(electrodomestico1.toString());
        System.out.println(electrodomestico2.toString());
        System.out.println(electrodomestico3.toString());

        System.out.println(electrodomestico4.toString()); //sale los atributos a null

    }
}