package Ejercicio1;

import java.util.List;

public class Directorio {

    private Integer id;
    private String name;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio() {
    }

    public Directorio(Integer id, String name, List<Directorio> subdirectorios, List<String> archivos) {
        this.id = id;
        this.name = name;
        this.subdirectorios = subdirectorios;
        this.archivos = archivos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Directorio{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subdirectorios=" + subdirectorios +
                ", archivos=" + archivos +
                '}';
    }
}
