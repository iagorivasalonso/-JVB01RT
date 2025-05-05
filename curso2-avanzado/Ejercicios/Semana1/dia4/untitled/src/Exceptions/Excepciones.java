package Exceptions;

public class Excepciones {
    public double verificarSalario(double salario) throws salarioExeption {

        double salarioValid = 0.0;
        if (salario < 0)
        {
            salarioValid = salario;
        }
        else
        {
            throw new salarioExeption("no puede estar sin cobrar");
        }
            return salarioValid;
    }
}
