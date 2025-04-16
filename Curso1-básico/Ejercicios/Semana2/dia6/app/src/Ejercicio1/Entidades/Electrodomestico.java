package Ejercicio1.Entidades;

public class Electrodomestico {

    String marca;
    String modelo;
    String consumoEnergetico;


    public Electrodomestico() {
    }

    public Electrodomestico(String marca, String modelo, String consumoEnergetico) {

        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                '}';
    }
}
