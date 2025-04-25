package Ejercicio3.Entidades;

public class Perro extends Animal implements accionesAnimal {

    String raza;


    public Perro(String nombre, int patas, String alimentacion, String raza, Boolean grande) {
        super(nombre, patas, alimentacion);

        this.raza = raza;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", patas=" + getPatas() +
                ", alimentacion='" + getAlimentacion() + '\'' +
                '}';
    }




    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra: Guau, Guau");
    }
}
