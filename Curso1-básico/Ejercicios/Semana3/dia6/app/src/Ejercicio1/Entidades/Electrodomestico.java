package Ejercicio1.Entidades;

public class Electrodomestico {

    private int cod;
    private String marca;
    private String modelo;
    private String consumoEnergetico;
    private String color;

    public Electrodomestico() {
    }

    public Electrodomestico(int cod, String marca, String modelo, String consumoEnergetico, String color) {

        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                '}';
    }
}
