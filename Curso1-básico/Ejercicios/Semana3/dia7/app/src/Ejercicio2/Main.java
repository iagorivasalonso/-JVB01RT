package Ejercicio2;


import Ejercicio2.entidades.Camiseta;
import Ejercicio2.entidades.Pantalon;
import Ejercicio2.entidades.Sombrero;
import Ejercicio2.entidades.Zapato;

public class Main {
    public static void main(String[] args) {

        Pantalon [] pantalones = new Pantalon[4];
        pantalones[0] = new Pantalon(1,"vaqueros",23,"Adidas",38,"gris","deportivo","algodon");
        pantalones[1] = new Pantalon(2, "chino", 30, "Levi's", 40, "beige", "casual", "lino");
        pantalones[2] = new Pantalon(3, "cargo", 35, "Nike", 42, "verde", "urbano", "mezclilla");
        pantalones[3] = new Pantalon(4, "skinny", 28, "Zara", 36, "negro", "moderno", "denim");


        Camiseta[] camisetas = new Camiseta[4];
        camisetas[0] = new Camiseta(1, "cami", 28, "Adidas", 38, "blanca", "corta", "bajo");
        camisetas[1] = new Camiseta(2, "polo", 32, "Nike", 40, "azul", "larga", "entallada");
        camisetas[2] = new Camiseta(3, "básica", 20, "Zara", 36, "negra", "corta", "regular");
        camisetas[3] = new Camiseta(4, "oversize", 35, "H&M", 42, "gris", "larga", "ancha");

        Sombrero[] sombreros = new Sombrero[4];
        sombreros[0] = new Sombrero(1, "calle", 10, "Adolfo D", 22, "Negro", "calle", 6);
        sombreros[1] = new Sombrero(2, "panamá", 25, "Gucci", 23, "beige", "elegante", 8);
        sombreros[2] = new Sombrero(3, "boina", 15, "Louis V", 21, "rojo", "casual", 5);
        sombreros[3] = new Sombrero(4, "vaquero", 30, "Wrangler", 24, "marrón", "cowboy", 10);

        Zapato[] zapatos = new Zapato[4];
        zapatos[0] = new Zapato(1, "zapa", 20.0, "adidas", 40, "negro", "cuero");
        zapatos[1] = new Zapato(2, "runner", 50.0, "Nike", 42, "blanco", "sintético");
        zapatos[2] = new Zapato(3, "bota", 70.5, "Timberland", 43, "marrón", "cuero");
        zapatos[3] = new Zapato(4, "mocasín", 45.0, "Clarks", 41, "azul", "ante");

        for (int i = 0; i < pantalones.length ; i++) {
            System.out.println(pantalones[i].toString());
        }
        System.out.println();
        for (int i = 0; i < camisetas.length ; i++) {
            System.out.println(camisetas[i].toString());
        }
        System.out.println();
        for (int i = 0; i < sombreros.length ; i++) {
            System.out.println(sombreros[i].toString());
        }
        System.out.println();
        for (int i = 0; i < zapatos.length ; i++) {
            System.out.println(zapatos[i].toString());
        }

    }
}