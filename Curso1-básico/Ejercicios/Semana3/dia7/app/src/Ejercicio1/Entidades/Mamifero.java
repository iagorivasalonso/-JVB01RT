package Ejercicio1.Entidades;

public class Mamifero extends Animal{

   private int numeroPatas;
   private String tipoReproduccion;
   private String colorPelaje;
   private String habitad;

    public Mamifero() {

    }

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitad) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitad = habitad;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un mamifero");
    }
    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getTipoReproduccion() {
        return tipoReproduccion;
    }

    public void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }


    @Override
    public String toString() {
        return "Mamifero{" +
                "numeroPatas=" + numeroPatas +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", habitad='" + habitad + '\'' +
                '}';
    }
}
