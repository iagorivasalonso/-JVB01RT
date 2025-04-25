package Ejercicio1.Entidades;

public class Auto implements Vehiculo{

    private String marca;
    private String modelo;
    private int puertas;
    private String color;

    public Auto() {
    }

    public Auto(String marca, String modelo, int puertas, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
        this.color = color;
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void acelerar() {
        System.out.println("El coche esta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("El coche freno");
    }
}
