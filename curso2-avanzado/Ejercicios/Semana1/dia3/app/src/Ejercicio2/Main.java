package Ejercicio2;

public class Main {

    public static void main(String[] args) {


        Runnable miRunnable1 = new Trabajador("Javier","ensabla el mueble");
        Runnable miRunnable2 = new Trabajador("Juan","embala Mueble");

        miRunnable1.run();
        miRunnable2.run();
    }
}
