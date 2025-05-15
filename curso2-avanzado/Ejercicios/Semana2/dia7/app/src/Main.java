import entityes.Auto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Auto> auto = new ArrayList<Auto>();

        auto.add(new Auto("renault", "modus", 2007, 12000));
        auto.add(new Auto("citroen", "Saxo", 2002, 13000));
        auto.add(new Auto("citroen", "xara", 2002, 15000));

        int opcion = -1;

        do {

            System.out.println("¿Que desea hacer? \n \n" +
                    "1. Agregar auto al inventario \n" +
                    "2. Buscar autos por marca o año \n" +
                    "3. Calcular valor del inventario \n" +
                    "0. Salir");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Auto nuevo = Utils.crearAuto(sc);
                    auto.add(nuevo);

                    for (int i = 0; i < auto.size(); i++) {
                        System.out.println(auto.get(i).toString());
                    }
                    break;

                case 2:
                          opcion = Buscar_por(sc);

                          if(opcion == 0)
                          {      /// favorece la vuelta a menu principal
                              opcion = -1;
                          }
                          else if(opcion == 1)
                          {
                              Utils.BuscarMarca(sc, auto);
                          }
                          else if(opcion == 2)
                          {
                              Utils.BuscarAnho(sc,auto);
                          }
                    break;

                case 3:
                         Utils.calcularValorTotal(auto);
                    break;
            }
        } while (opcion != 0);


    }

    private static int Buscar_por(Scanner sc) {

        System.out.println("¿Por que desea buscar? \n \n" +
                "1. Por marca \n" +
                "2. Por año \n" +
                "0. Salir");

        int opcion = sc.nextInt();

        return opcion;
    }

}