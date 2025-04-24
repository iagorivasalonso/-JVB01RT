package Ejercicio1;

public class Camioneta extends  Vehiculo implements Combustion{

    int capacidadTanque;
    int consumoCombustible;


    public Camioneta() {

    }

    public Camioneta(int id, String placa, String marca, String modelo, int anho, double costo, int capacidadTanque, int consumoCombustible) {
        super(id, placa, marca, modelo, anho, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public int getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(int consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Esta cargando con gasolina");
    }

    @Override
    public void recargarConbustible() {
        System.out.println("Esta recargando con gasolina");
    }
}
