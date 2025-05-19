package Ejercicio2;

import java.util.List;

public class Tarea {

    private String nombre;
    private List<SubTarea> Subtareas;

    public Tarea() {
    }

    public Tarea(String nombre, List<SubTarea> subtareas) {
        this.nombre = nombre;
        Subtareas = subtareas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<SubTarea> getSubtareas() {
        return Subtareas;
    }

    public void setSubtareas(List<SubTarea> subtareas) {
        Subtareas = subtareas;
    }

    @Override
    public String toString() {

        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", Subtareas=" + Subtareas +
                '}';
    }
}