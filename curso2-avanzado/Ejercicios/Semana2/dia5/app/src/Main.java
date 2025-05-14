import Entities.Empleados;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Empleados> empleado =List.of(
                new Empleados("pepe", 1.500, "categoria1"),
                new Empleados("maria", 1.800, "categoria2"),
                new Empleados("juan", 1.700, "categoria1"),
                new Empleados("ana", 1.600, "categoria2")
        );



        double sueldoComprobar = 1.600;
        List<Empleados> empleadosMasCobran = empleado.stream().filter(unempleado -> unempleado.getSalario() >sueldoComprobar).toList();
        System.out.println("Los empleados que cobran mas de "+sueldoComprobar+" Son: " +empleadosMasCobran);


       Map<String,List<String>> mapa = empleado.stream().collect(Collectors.groupingBy(
               Empleados::getCategoria,
               Collectors.mapping(Empleados::getNombre, Collectors.toList())
       ));

        System.out.println("Las categorias de los empleados son"+mapa);

        Map<String,Double> mediaCategoria = empleado.stream()
                .collect(Collectors.groupingBy(Empleados::getCategoria,
                 Collectors.averagingDouble(Empleados::getSalario)));

        System.out.println("El salario medio por categoria es"+mediaCategoria);

        Optional<Empleados> max = empleado.stream().max((empleado1, empledo2) ->
                Double.compare(empleado1.getSalario(), empledo2.getSalario()));

        System.out.println("El empleado que mas cobra es "+max.get().getNombre());

    }
}