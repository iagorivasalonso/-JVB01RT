package Ejercicio2.entidades;

public class Pantalon extends Vestimenta implements  Prenda{

    String estilo;
    String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(int codigo, String nombre, double precio, String marca, int talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public String mostrar() {
        return "Este pantalon es de marca";
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "estilo='" + estilo + '\'' +
                ", tipoTejido='" + tipoTejido + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                '}';
    }
}
