package Ejercicio1;

public class Auto extends Vehiculo implements Electrico{

    String capacidadBateria;
    int autonomia;

    public Auto() {
    }

    public Auto(String capacidadBateria, int autonomia) {
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public Auto(int id, String placa, String marca, String modelo, int anho, double costo, String capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anho, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public String getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(String capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }



    @Override
    public void cargarEnergia() {
        System.out.println("Esta cargando con electricidad");
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Esta recargando con electricidad");
    }
}
