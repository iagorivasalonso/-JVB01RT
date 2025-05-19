package Ejercicio2;

import java.util.List;

public class SubTarea {

    private String nombre;
    private List<SubTarea> Subtareas;

    @Override
    public String toString() {
        return "subTarea{" +
                "nombre='" + nombre + '\'' +
                ", SubSubtareas=" + Subtareas +
                '}';
    }

    public SubTarea() {
    }

    public SubTarea(String nombre) {
        this.nombre = nombre;
    }
    public SubTarea(String nombre, List<SubTarea> subtareas) {
        this.nombre = nombre;
        this.Subtareas = subtareas;
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
        this.Subtareas = subtareas;
    }

}
