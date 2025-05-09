package Ejercicio1;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Agente agente1 = new Agente("luis","no va internet","¿cuando vuelve?");
        Agente agente2 = new Agente("jose","instalacion fibra","¿cuando lo hacen?");

        agente1.start();
        agente2.start();

        agente1.join();
        agente2.join();

    }
}