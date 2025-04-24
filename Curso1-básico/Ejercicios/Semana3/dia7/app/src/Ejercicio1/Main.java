package Ejercicio1;

import Ejercicio1.Entidades.Animal;
import Ejercicio1.Entidades.Ave;
import Ejercicio1.Entidades.Mamifero;
import Ejercicio1.Entidades.Reptil;

public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero(1,"man1",12,"rugosa","Seca",4,"normal","negro","natural");
        Ave ave = new Ave(2,"ave1",2,"ruda","restos",2);
        Reptil reptil = new Reptil(3,"Reptil",3,"escamas","mojada",111,"ruda","venenosa","mar");

        Animal animal = mamifero;

        System.out.println(mamifero.saludar());
        System.out.println(ave.saludar());
        System.out.println(reptil.saludar());

    }
}