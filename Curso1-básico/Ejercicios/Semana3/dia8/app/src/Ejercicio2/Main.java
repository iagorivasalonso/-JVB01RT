package Ejercicio2;

import Ejercicio2.Entidades.Pago;
import Ejercicio2.Entidades.TipoPago;

public class Main {

    public static void main(String[] args) {

        Pago p1 = new Pago(232435353,"Abanca", TipoPago.EFECTIVO);
        Pago p2 = new Pago(323243553,"Santander", TipoPago.TARJETA_DEBITO);

        p1.mostrarTipoPago();
        p2.mostrarTipoPago();

    }
}
