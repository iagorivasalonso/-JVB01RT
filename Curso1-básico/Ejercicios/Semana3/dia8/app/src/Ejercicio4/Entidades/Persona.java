package Ejercicio4.Entidades;

public class Persona {

    private String nombre;
    private Direccion direccion;


    public Persona(String nombre, String calle, String ciudad) {
        this.nombre = nombre;
        this.direccion = new  Direccion(calle,ciudad);
    }

    public class Direccion {

     String Calle;
     String ciudad;

     public Direccion(String calle, String ciudad) {
         this.Calle = calle;
         this.ciudad = ciudad;
     }

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", calle=" + direccion.Calle +
                ", ciudad=" + direccion.ciudad +
                '}';
    }
}
