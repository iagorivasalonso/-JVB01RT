package Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Persona [] personas = new Persona[5];

        personas[0] = new Persona(1,"Ana",32,"Canido","123456789");
        personas[1] = new Persona(2,"Maria",39,"Samil","123456789");
        personas[2] = new Persona(3,"Pedro",22,"avd Madrid","123456789");
        personas[3] = new Persona(4,"Javier",42,"samil","123456789");
        personas[4] = new Persona(5,"Jorge",19,"Navia","123456789");

        for (int i = 0; i < personas.length ; i++) {
            System.out.println(personas[i].toString());
        }

        personas[1].setNombre("Pepa");
        personas[3].setNombre("Manolo");
        System.out.println("\n nombres cambiados: \n");

        for (int i = 0; i < personas.length ; i++) {
            System.out.println(personas[i].toString());
        }

        System.out.println("\n personas mayores de 30 años \n");

        for (int i = 0; i < personas.length ; i++)
        {
            if(personas[i].getEdad() >30)
            System.out.println(personas[i].toString());
        }
    }
}