package Ejercicio2;

public class Main {

    public static void main(String[] args) {


        Estacion est = new Estacion();

        int personas = 3;

        for (int i = 0; i < personas; i++)
        {
            Thread persona = new Thread(new Trabajador(" Javier ", est));
            persona.start();
        }




    }
}
