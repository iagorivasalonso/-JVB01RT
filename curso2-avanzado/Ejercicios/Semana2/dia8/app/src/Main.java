import Utils.RegistroMascota;
import entityes.Mascota;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        RegistroMascota registro = new RegistroMascota();

        registro.agregarMascota(new Mascota<>("mico",12,"Gato"));
        registro.agregarMascota(new Mascota<>("avi",5,"Ave"));

        //busqueda de mascotas por nombre
        System.out.println("macotas con nombre avi"+registro.BuscarPorNombre("avi"));

        //busqueda de mascotas por especie
        System.out.println("macotas de especie perro"+registro.BuscarPorEspecie("Perro"));

        //contar mascotas
        System.out.println("la cantidad de mascotas es "+registro.numeroMascotas());

        for (int i = 0; i < 5; i++) {
            registro.generarMascota();
        }

    }
}