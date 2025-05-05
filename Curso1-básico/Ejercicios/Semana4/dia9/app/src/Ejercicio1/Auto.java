package Ejercicio1;

import Ejercicio1.Interfaces.Electrico;

import java.time.LocalDate;

public class Auto extends Vehiculo implements Electrico {

    private int capacidadBateria;
    private int autonomia;

    public Auto() {
    }



    public Auto(int id, String placa, String marca, String modelo, int anho, double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anho, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
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

        System.out.println("Esta cargando con electricidad, tiene una capacided de"+this.capacidadBateria+" mah");
    }

    @Override
    public void recargarCombustible() {

        System.out.println("Esta recargando con electricidad");
    }

}
