package version1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public  class InventarioAutos {

  public static <T> void agregar (List<T> inventario, T item){
      inventario.add(item);

  }

  public static <T> List<T>buscarPor(List<T> inventario, Predicate<T>criterio){
      return inventario.stream().filter(criterio).toList();
  }


    public static<T> double sumaElementos(ArrayList<T> inventario, Function<T, Double> extractor) {

      return inventario.stream().mapToDouble(extractor::apply).sum();
    }
}
