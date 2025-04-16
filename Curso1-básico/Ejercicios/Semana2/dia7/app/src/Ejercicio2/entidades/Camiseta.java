package Ejercicio2.entidades;

public class Camiseta  extends Vestimenta implements Prenda{

    String manga;
    String cuello;

    public Camiseta() {
    }

    public Camiseta(int codigo, String nombre, double precio, String marca, int talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    @Override
    public String mostrar() {
        return "Esta camiseta es de marca";
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "manga='" + manga + '\'' +
                ", cuello='" + cuello + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                '}';
    }
}
