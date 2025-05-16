import entities.Evento;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        ArrayList<Evento> eventos = new ArrayList<>();


        eventos.add(new Evento("cenaTrabajo", LocalDate.of(2024, 12, 22),"cat1"));
        eventos.add(new Evento("inicioTemporadaVerano",LocalDate.of(2025, 6, 22),"cat2"));
        eventos.add(new Evento("cenainicioTemporada",LocalDate.of(2025, 6, 22),"cat2"));
        eventos.add(new Evento("rebajasVerano",LocalDate.of(2025, 7, 2),"cat3"));
        eventos.add(new Evento("finTemporada",LocalDate.of(2025, 9, 22),"cat1"));
        eventos.add(new Evento("cenaPersonalTemporada",LocalDate.of(2025, 9, 22),"cat1"));


        //Eventos fecha especifica
        LocalDate fechaBuscada = LocalDate.of(2025, 9, 22);

        List<Evento>eventosDia = eventos.stream().filter( evento -> evento.getFecha().isEqual(fechaBuscada)).toList();

        if(eventosDia.isEmpty())
        {
            System.out.println("no tienes eventos");
        }
        else
        {
            System.out.println("eventos");
            System.out.println(eventosDia);
        }



        Map<String,Integer> eventosCategoria = eventos.stream().collect(Collectors.groupingBy(Evento::getCategoria,Collectors.summingInt(e->1)));
        System.out.println(eventosCategoria);

        Optional<Evento>eventoProx = eventos.stream().filter(e-> e.getFecha().isAfter(LocalDate.now())).sorted(Comparator.comparing(Evento::getFecha)).findFirst();

       if(eventoProx.isPresent())
           System.out.println(eventoProx.get());

       //eventos a partir de hoy !e.getFecha().isBefore(LocalDate.now())

    }
}