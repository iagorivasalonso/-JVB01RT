import Entities.Categoria;
import Entities.Empleados;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List <Empleados> empleado =List.of(
                new Empleados("pepe", 1.500, Categoria.Analista),
                new Empleados("maria", 1.800, Categoria.Gerente),
                new Empleados("juan", 1.700, Categoria.Desarrollador),
                new Empleados("ana", 1.600, Categoria.Desarrollador)
        );


         //Empleados que mas cobran
        double sueldoLimite = 1.600;
        List<Empleados> empleadosMasCobran = empleado.stream().filter(unempleado -> unempleado.getSalario() >sueldoLimite).toList();


        if(empleadosMasCobran.isEmpty())
        {
            System.out.println("no tiene empleados con sueldo tan alto");
        }
        else
        {
            empleadosMasCobran.forEach(System.out::println);
        }


        //categorias de empleados
       Map<Categoria,List<Empleados>> mapa = empleado.stream().collect(Collectors.groupingBy(Empleados::getCategoria));

        System.out.println("Las categorias de los empleados son"+mapa);

        Map<Categoria,Double> mediaCategoria = empleado.stream()
                .collect(Collectors.groupingBy(Empleados::getCategoria,
                 Collectors.averagingDouble(Empleados::getSalario)));

        System.out.println("El salario medio por categoria es"+mediaCategoria);

        Empleados max = empleado.stream().max((empleado1, empledo2) ->
                Double.compare(empleado1.getSalario(), empledo2.getSalario())).orElse(null);

        System.out.println("El empleado que mas cobra es "+max.getNombre());

    }
}