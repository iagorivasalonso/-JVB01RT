package entityes;

import java.util.UUID;

public class Mascota<T> {

    private UUID id;
    private String nombre;
    private int edad;
    private T especie;



    public Mascota(String name, int edad, T especie) {
        this.id = UUID.randomUUID();
        this.nombre = name;
        this.edad = edad;
        this.especie = especie;
    }



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public T getEspecie() {
        return especie;
    }

    public void setEspecie(T especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id=" + id +
                ", name='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie=" + especie +
                '}';
    }
}