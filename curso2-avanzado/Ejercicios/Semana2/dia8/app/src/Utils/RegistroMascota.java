package Utils;

import entityes.Mascota;

import java.util.*;

public class RegistroMascota {

    private final List<Mascota<?>> registro;
    private final Random rn;

    public void generarMascota(){
        String[] nombres = {"Luna", "Max", "Briciola", "Dana", "Roky"};
        List<String> especies = Arrays.asList("Perro", "Gato", "Reptil", "Aves");

        String nombre = nombres[rn.nextInt(nombres.length)];
        int edad = rn.nextInt(15)+1;
        String especie = especies.get(rn.nextInt(especies.size()));

        Mascota<String> mascota = new Mascota<>(nombre,edad,especie);
        System.out.println(mascota);
    }
    public RegistroMascota() {
        this.rn = new Random();
        this.registro = new ArrayList<>();
    }

    public <T>void agregarMascota(Mascota<?> objectMascota) {

    registro.add(objectMascota);
    }

    public List<Mascota<?>> BuscarPorNombre(String nombre) {

        return registro.stream().filter(n->n.getName().equalsIgnoreCase(nombre)).toList();

    }

    public <T >List<Mascota<?>> BuscarPorEspecie (T especie) {

        return registro.stream().filter(n ->n.getEspecie().equals(especie)).toList();
    }

    public int numeroMascotas(){

        return registro.size();
    }
}
