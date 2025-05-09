package Ejercicio2;

public class Trabajador implements Runnable {

    private String nombre;
    private String tarea;

    public Trabajador() {
    }

    public Trabajador(String nombre, String tarea) {
        this.nombre = nombre;
        this.tarea = tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    @Override
    public void run() {
        for (int i = 0; i <6; i++)
        {
            System.out.println("El trabajador "+this.nombre+" tiene que"+this.tarea);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("fin de la accion");
        }
    }
}
