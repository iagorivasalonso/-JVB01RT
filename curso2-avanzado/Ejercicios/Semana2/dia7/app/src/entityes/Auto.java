package entityes;

public class Auto {

    private String marca;
    private String modelo;
    private int anho;
    private Double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anho, Double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anho=" + anho +
                ", precio=" + precio +
                '}';
    }
}
