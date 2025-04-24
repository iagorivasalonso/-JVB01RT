package Ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

        Auto auto1 = new Auto(1,"3755WER","renault","modus",2007,6000,"litio",200);
        vehiculos.add(auto1);
        Moto moto1 = new Moto(2, "3456kjd","yamaha","2222",2012,4000,125,"combus");
        vehiculos.add(moto1);
        Camioneta Camioneta1 = new Camioneta(3,"3242gtr","renault","kangoo",2020,8000,50,22);
        vehiculos.add(Camioneta1);

        for (int i = 0; i < vehiculos.size(); i++) {
            System.out.println(vehiculos.get(i).toString());
        }
    }
}