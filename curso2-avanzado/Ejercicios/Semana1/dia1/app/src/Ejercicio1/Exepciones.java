package Ejercicio1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exepciones {

    public Date validarFecha(String fechaTexto) {

        Date fechaValida = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            fechaValida = sdf.parse(fechaTexto);

        } catch (ParseException e) {
            System.err.println("La fecha es incorrecta");
        }
       return fechaValida;
    }

}
