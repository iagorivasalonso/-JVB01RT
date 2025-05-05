package Ejercicio1;

public class Agente extends Thread{

    private String nombre;
    private String consulta;
    private String info;

    public Agente() {
    }

    public Agente(String nombre, String consulta, String info) {
        this.nombre = nombre;
        this.consulta = consulta;
        this.info = info;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "nombre='" + nombre + '\'' +
                ", consulta='" + consulta + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    public void run(){
        for (int i = 0; i < 10; i++)
        {
            System.out.println(this.nombre+" Tiene la consulta de "+this.consulta);

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("fin de llamada de " +this.nombre);
        }
    }
}
