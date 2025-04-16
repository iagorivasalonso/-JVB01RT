package Ejercicio2.entidades;

public class Zapato extends Vestimenta implements  Prenda{

    String material;
    String tipoCierre;

    public Zapato() {
    }

    public Zapato(int codigo, String nombre, double precio, String marca, int talla, String color, String material) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String mostrar() {
        return "Este zapato es de marca";
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "material='" + material + '\'' +
                ", tipoCierre='" + tipoCierre + '\'' +
                ", codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", talla=" + talla +
                ", color='" + color + '\'' +
                '}';
    }
}
