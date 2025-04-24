package Ejercicio2.Entidades;

public class Pago {

    int numero;
    String banco;
    TipoPago tipo;

    public Pago() {
    }

    public Pago(int numero, String banco, TipoPago tipo) {
        this.numero = numero;
        this.banco = banco;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public TipoPago getTipo() {
        return tipo;
    }

    public void setTipo(TipoPago tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "numero=" + numero +
                ", banco='" + banco + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
