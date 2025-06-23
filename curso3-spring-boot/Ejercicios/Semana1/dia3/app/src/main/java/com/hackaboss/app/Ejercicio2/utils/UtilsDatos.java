package com.hackaboss.app.Ejercicio2.utils;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class UtilsDatos {

    public String esLetra(String entrada) {

        String codigo ="";
        String aux="";

        if(entrada.contains(" "))
        {
            List<String> palabras = Arrays.asList(entrada.split(" "));

            codigo = "";

            for (int i = 0; i < palabras.size(); i++)
            {
                aux = palabraAmorse(palabras.get(i));
                codigo = codigo.concat(aux);

                if(i != palabras.size()-1)
                    codigo+= "   ";  // tres espacio

            }

        }
        else
        {
           codigo  = palabraAmorse(entrada);
        }

        return codigo;
    }

    private String palabraAmorse(String entrada) {

        char[] letras = entrada.toCharArray();
        String codigo ="";
        for (int x = 0; x <letras.length; x++)
        {

            List<String> morse= Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                    "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..");

            List<String> alfabeto = Arrays.asList(
                    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                    "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            );

            int finalX = x;
            int pos = IntStream.range(0, alfabeto.size())
                    .filter(p -> alfabeto.get(p).equalsIgnoreCase(String.valueOf(letras[finalX])))
                    .findFirst()
                    .orElse(-1);

            if(pos!=-1){
                codigo = codigo.concat(morse.get(pos));

                if (x < letras.length - 1) {
                    codigo = codigo.concat(" ");  // agrega espacio entre letras
                }
            }

        }
        return codigo;
    }

    public String esNumero(String entrada) {

        char[] numeros = entrada.toCharArray();
        String codigo="";

        for (int x = 0; x <numeros.length; x++)
        {
            List<String> morse = Arrays.asList("-----",".----","..---","...--","....-",".....", "-....","--...","---..",  "----.");

            int finalX = x;
            int pos = Integer.parseInt(String.valueOf(numeros[finalX]));

            codigo = codigo.concat(morse.get(pos) + " ");

        }

        return codigo;
    }
}
