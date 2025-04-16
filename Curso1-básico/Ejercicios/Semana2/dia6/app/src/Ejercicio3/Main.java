package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        Verdura [] verdura  = new Verdura[5];

        verdura[0] = new Verdura(0,"Lechuga"," negra",15,false);
        verdura[1] = new Verdura(1,"Brocoli","verde",34,true);
        verdura[2] = new Verdura(2,"Repollo","verde",25,true);
        verdura[3] = new Verdura(3,"Acelga","verde",19,true);
        verdura[4] = new Verdura(4,"Pepino","amarillo",16,false);

        for (int i = 0; i < verdura.length ; i++) {
            System.out.println(verdura[i].toString());
        }
        System.out.println("\n cambio productos \n");

        verdura[0].nombre="Remolacha";
        verdura[0].calorías= 43;
        verdura[0].debeCocinarse=true;

        verdura[3].nombre="Zanahoria";
        verdura[3].calorías= 41;
        verdura[3].color ="Naranja";
        verdura[3].debeCocinarse=true;

        for (int i = 0; i < verdura.length ; i++) {
            System.out.println(verdura[i].toString());
        }

        System.out.println("\n las verduras verdes son \n");

        for (int i = 0; i < verdura.length ; i++) {
            if(verdura[i].color.equals("verde"))
            System.out.println(verdura[i].toString());
        }
    }
}