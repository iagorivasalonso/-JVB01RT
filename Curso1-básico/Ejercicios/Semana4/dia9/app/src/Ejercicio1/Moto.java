package Ejercicio1;

import Ejercicio1.Interfaces.Combustion;

public class Moto extends Vehiculo implements Combustion {

    private int cilindrada;
    private String tipoMotor;

    public Moto() {

    }

    public Moto(int id, String placa, String marca, String modelo, int anho, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anho, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Esta cargando con gasolina");
    }

    @Override
    public void recargarConbustible() {
        System.out.println("Recargando combustible de la moto con cilindrada " + this.cilindrada);
    }
}
