package Ejercicio1.Entidades;

public class Ave extends Animal{

    private  int envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ave() {
    }

    public Ave(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int envergaduraAlas) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
    }

    public int getEnvergaduraAlas() {
        return envergaduraAlas;
    }

    public void setEnvergaduraAlas(int envergaduraAlas) {
        this.envergaduraAlas = envergaduraAlas;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getColorPlumaje() {
        return colorPlumaje;
    }

    public void setColorPlumaje(String colorPlumaje) {
        this.colorPlumaje = colorPlumaje;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    @Override
    public String saludar() {
        return "Hola soy  un ave";

    }
    
}
