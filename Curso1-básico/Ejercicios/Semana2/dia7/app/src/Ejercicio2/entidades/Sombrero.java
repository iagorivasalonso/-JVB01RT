package Ejercicio2.entidades;

public class Sombrero extends Vestimenta implements  Prenda{

    String tipo;
    int tamaño;

    public Sombrero() {

    }

    public Sombrero(int codigo, String nombre, double precio, String marca, int talla, String color, String tipo, int tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String mostrar() {
        return "Este sombrero es de marca";
    }

    @Override
    public String toString() {
        return "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamaño=" + tamaño +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                '}';
    }
}
