package org.example.utils;


import org.example.utils.Exceptions.DatoInvalidoException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Excepciones {

    public Date validarFecha (String fechaTexto){

        Date fechaValida = null;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            fechaValida = sdf.parse(fechaTexto);
        } catch (ParseException e) {
            System.err.println("El formato de la fecha no es valido");
        }
        return fechaValida;
    }

    public String validarTelefono(String telefono) throws DatoInvalidoException {

        String telefonoValido = " ";


            if(telefono.length()!=9)
            {
                throw new DatoInvalidoException("El telefono debe de tener 9 digitos");
            }
            else
            {
                telefonoValido = telefono;
            }

        return  telefonoValido;
    }


    public String validarEmail(String email) throws DatoInvalidoException {

        String emailValido =" ";

        if(email.contains("@") && email.contains("."))
        {
             emailValido = email;
        }
        else
        {
            throw new DatoInvalidoException("El formato del email no es valido");
        }
        return emailValido;
    }
}
