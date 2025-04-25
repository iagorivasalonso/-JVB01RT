package Ejercicio1.Entidades;

public class Reptil extends Animal{

    private  long longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitad;

    public Reptil() {
    }

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, long longitud, String tipoEscamas, String tipoVeneno, String habitad) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitad = habitad;
    }

    public long getLongitud() {
        return longitud;
    }

    public void setLongitud(long longitud) {
        this.longitud = longitud;
    }

    public String getTipoEscamas() {
        return tipoEscamas;
    }
    @Override
    public void saludar() {
        System.out.println("Hola soy un reptil");
    }

    public void setTipoEscamas(String tipoEscamas) {
        this.tipoEscamas = tipoEscamas;
    }

    public String getTipoVeneno() {
        return tipoVeneno;
    }

    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }


    @Override
    public String toString() {
        return "Reptil{" +
                "longitud=" + longitud +
                ", tipoEscamas='" + tipoEscamas + '\'' +
                ", tipoVeneno='" + tipoVeneno + '\'' +
                ", habitad='" + habitad + '\'' +
                '}';
    }
}
