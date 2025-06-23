package entities;
import java.time.LocalDate;
import java.util.Date;

public class Vuelo {

    private int id;
    private String nombreVuelo;
    private String empresa;
    private String lugarSalida;
    private String lugarLlegada;

    private LocalDate fechaInicio;
    private LocalDate fechafin;

    public Vuelo() {
    }

    public Vuelo(int id, String nombreVuelo, String empresa, String lugarSalida, String lugarLlegada, LocalDate fechaInicio, LocalDate fechafin) {
        this.id = id;
        this.nombreVuelo = nombreVuelo;
        this.empresa = empresa;
        this.lugarSalida = lugarSalida;
        this.lugarLlegada = lugarLlegada;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreVuelo() {
        return nombreVuelo;
    }

    public void setNombreVuelo(String nombreVuelo) {
        this.nombreVuelo = nombreVuelo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLugarSalida() {
        return lugarSalida;
    }

    public void setLugarSalida(String lugarSalida) {
        this.lugarSalida = lugarSalida;
    }

    public String getLugarLlegada() {
        return lugarLlegada;
    }

    public void setLugarLlegada(String lugarLlegada) {
        this.lugarLlegada = lugarLlegada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "id=" + id +
                ", nombreVuelo='" + nombreVuelo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", lugarSalida='" + lugarSalida + '\'' +
                ", lugarLlegada='" + lugarLlegada + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechafin=" + fechafin +
                '}';
    }
}
