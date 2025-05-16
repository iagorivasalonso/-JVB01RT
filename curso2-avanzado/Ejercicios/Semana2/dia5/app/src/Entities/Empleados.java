package Entities;

public class Empleados {

    private String nombre;
    private Double salario;
    private Categoria categoria;

    public Empleados() {
    }

    public Empleados(String nombre, Double salario, Categoria categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleados{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria=" + categoria +
                '}';
    }
}
