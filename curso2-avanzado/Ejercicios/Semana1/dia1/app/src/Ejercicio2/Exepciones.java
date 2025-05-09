package Ejercicio2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exepciones {

    public String validarNoVacio (String dato) {

        String datoCorrecto = "";


            if (!dato.isEmpty()) {
                 datoCorrecto = dato;
            }
            else
            {
                System.err.println("no puede ir vacio");
            }



      return datoCorrecto;
    }
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
