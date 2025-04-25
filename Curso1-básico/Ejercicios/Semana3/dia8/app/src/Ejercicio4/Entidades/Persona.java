package Ejercicio4.Entidades;

public class Persona {

        private String nombre;
        private Direccion direccion;

        public class Direccion {

             private String Calle;
             private String ciudad;

             public Direccion(String calle, String ciudad) {
                 this.Calle = calle;
                 this.ciudad = ciudad;
             }
       }
    public Persona(String nombre, String calle, String ciudad) {
        this.nombre = nombre;
        this.direccion = new  Direccion(calle,ciudad);
    }

    public  void mostrarDireccion(){
        System.out.println(this.nombre+ " vive en "+direccion.Calle +", "+direccion.ciudad);
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
