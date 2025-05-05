package Ejercicio1;

import java.util.Date;

public class reservaVuelo {

    private String nombre;
    private String destino;
    private Date fechaViaje;
    private int asientosDeseados;

    public reservaVuelo() {

    }

    public reservaVuelo(String nombre, String destino, Date fechaViaje, int asientosDeseados) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosDeseados = asientosDeseados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public int getAsientosDeseados() {
        return asientosDeseados;
    }

    public void setAsientosDeseados(int asientosDeseados) {
        this.asientosDeseados = asientosDeseados;
    }

    @Override
    public String toString() {
        return "reservaVuelo{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje=" + fechaViaje +
                ", asientosDeseados=" + asientosDeseados +
                '}';
    }

}
