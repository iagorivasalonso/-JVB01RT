package com.hackaboss.app.Ejercicio1.utils;

public class Conversor {
    public static String convertirUnidades(int numero) {

        double numeroConvertido =  (double) numero / 100;
      return "El equivalente a " + numero +" cm es de " +numeroConvertido+" metros";
    }
}
