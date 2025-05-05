package Ejercicio1;

import Ejercicio1.Interfaces.Combustion;

public class Camioneta extends  Vehiculo implements Combustion {

    private int capacidadTanque;
    private Double consumoCombustible;


    public Camioneta() {

    }


    public int calcularAntiguedad(int anho) {
        return 0;
    }

    public Camioneta(int id, String placa, String marca, String modelo, int anho, double costo, int capacidadTanque, Double consumoCombustible) {
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

    public Double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Esta cargando con gasolina");
    }

    @Override
    public void recargarConbustible() {
        System.out.println("Recargando combustible de la camioneta con capacidad del tanque "+this.capacidadTanque);
    }
}
