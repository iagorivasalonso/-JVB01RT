import entities.Vuelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import utils.OperacionesFiltro;

public class Main {
    public static void main(String[] args) {


        final LocalDate FECHADESDE = null;
        final LocalDate FECHAHASTA =  null;


        ArrayList <Vuelo> vuelos = new ArrayList<>();
        vuelos.add(new Vuelo(0, "alicante_amsterdam", "klm", "Alicante", "Ámsterdam", LocalDate.of(2025, 3, 15), LocalDate.of(2025, 3, 15)));
        vuelos.add(new Vuelo(1, "sevilla_roma", "ryanair", "Sevilla", "Roma", LocalDate.of(2025, 5, 10), LocalDate.of(2025, 5, 11)));
        vuelos.add(new Vuelo(2, "murcia_oslo", "norwegian", "Murcia", "Oslo", LocalDate.of(2025, 5, 24), LocalDate.of(2025, 5, 26)));
        vuelos.add(new Vuelo(3, "vigo_barcelona", "iberia", "Vigo", "Barcelona", LocalDate.of(2025, 3, 2), LocalDate.of(2025, 3, 5)));
        vuelos.add(new Vuelo(5, "santiago_frankfurt", "lufthansa", "Santiago", "Fráncfort", LocalDate.of(2025, 1, 30), LocalDate.of(2025, 1, 31)));
        vuelos.add(new Vuelo(6, "bilbao_londres", "britishairways", "Bilbao", "Londres", LocalDate.of(2025, 5, 5), LocalDate.of(2025, 5, 6)));
        vuelos.add(new Vuelo(7, "madrid_paris", "airfrance", "Madrid", "París", LocalDate.of(2025, 4, 10), LocalDate.of(2025, 4, 10)));
        vuelos.add(new Vuelo(8, "malaga_dublin", "aerlingus", "Málaga", "Dublín", LocalDate.of(2025, 2, 28), LocalDate.of(2025, 3, 1)));
        vuelos.add(new Vuelo(9, "zaragoza_milan", "vueling", "Zaragoza", "Milán", LocalDate.of(2025, 5, 1), LocalDate.of(2025, 5, 1)));
        vuelos.add(new Vuelo(10, "valencia_berlin", "lufthansa", "Valencia", "Berlín", LocalDate.of(2025, 4, 20), LocalDate.of(2025, 4, 21)));

        List<Vuelo> filtroVuelos = List.of();                    //funcion de filtro de vuelos
        filtroVuelos = OperacionesFiltro.filtro(vuelos,filtroVuelos, FECHADESDE,FECHAHASTA);


        //a traves de esta funcion ordenamos los vuelos por fecha de salida en este caso
        List<Vuelo> vuelosOrdenadosPorFechaSalida = OperacionesFiltro.ordenar(filtroVuelos);

        //imprimimos el resultado ordenado
        vuelosOrdenadosPorFechaSalida.stream().forEach(System.out::println);


    }
}