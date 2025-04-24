package Ejercicio3.Entidades;

public abstract  class Animal {

    String nombre;
    int patas;
    String alimentacion;


    public Animal() {
    }

    public Animal(String nombre, int patas, String alimentacion) {
        this.nombre = nombre;
        this.patas = patas;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", patas=" + patas +
                ", alimentacion='" + alimentacion + '\'' +
                '}';
    }
}
