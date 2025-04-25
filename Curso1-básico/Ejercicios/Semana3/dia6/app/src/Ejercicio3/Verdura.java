package Ejercicio3;

public class Verdura {

    private int id;
    private String nombre;
    private  String color;
    private  int calorías;
    private  Boolean debeCocinarse;

    public Verdura() {

    }

    public Verdura(int id, String nombre, String color, int calorías, Boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorías = calorías;
        this.debeCocinarse = debeCocinarse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCalorías() {
        return calorías;
    }

    public void setCalorías(int calorías) {
        this.calorías = calorías;
    }

    public Boolean getDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(Boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }

    @Override
    public String toString() {
        return "Verdura{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", calorías=" + calorías +
                ", debeCocinarse=" + debeCocinarse +
                '}';
    }
}
