package Ejercicio2;

public class Trabajador implements Runnable {

    private Estacion estac;
    private String nombre;

    public Trabajador() {
    }

    public Trabajador(String nombre, Estacion estac) {
        this.nombre = nombre;
        this.estac = estac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estacion getEstac() {
        return estac;
    }

    public void setEstac(Estacion estac) {
        this.estac = estac;
    }

    @Override
    public void run() {
        estac.ensamblar(nombre);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        estac.controlar(nombre);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        estac.embalar(nombre);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
