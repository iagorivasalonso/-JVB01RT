package Ejercicio1;

import Ejercicio1.Entidades.Animal;
import Ejercicio1.Entidades.Ave;
import Ejercicio1.Entidades.Mamifero;
import Ejercicio1.Entidades.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        Ave ave = new Ave();
        Reptil reptil = new Reptil();

        mamifero.saludar();
        ave.saludar();
        reptil.saludar();

        Animal animal = mamifero;

    }
}