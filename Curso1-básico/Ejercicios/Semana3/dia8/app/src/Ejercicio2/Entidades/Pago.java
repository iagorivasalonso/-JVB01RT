package Ejercicio2.Entidades;

public class Pago {

   private int numero;
   private String banco;
   private TipoPago tipoPago;

    public Pago() {
    }

    public Pago(int numero, String banco, TipoPago tipo) {
        this.numero = numero;
        this.banco = banco;
        this.tipoPago = tipo;
    }

    public void mostrarTipoPago() {
        System.out.println("El tipo de pago es " + this.tipoPago);
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

    public TipoPago getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(TipoPago tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "numero=" + numero +
                ", banco='" + banco + '\'' +
                ", tipo=" + tipoPago +
                '}';
    }
}
