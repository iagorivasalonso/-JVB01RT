import entities.Vuelo;

public class Main {
    public static void main(String[] args) {

        Vuelo v = new Vuelo(0,"vigo_barcelona","iberia","Vigo","Barcelona",null,null);

        System.out.println(v.toString());
    }
}