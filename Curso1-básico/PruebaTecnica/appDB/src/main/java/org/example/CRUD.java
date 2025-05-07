package org.example;

import org.example.entities.Cliente;
import org.example.persistence.ClienteJPA;
import org.example.utils.Excepciones;
import org.example.utils.Exceptions.DatoInvalidoException;

import java.util.*;

public class CRUD {

    ClienteJPA clienteJPA = new ClienteJPA();
    Excepciones excep = new Excepciones();

    private List<Cliente> cargarClientes() {

        List<Cliente> todosClientes =  clienteJPA.findAll();

        return todosClientes;
    }
    public void agregarCliente(Scanner sc) {

        List<Cliente> listadoClientes = cargarClientes();

        boolean err = false;
        boolean campRepeat = false;
        int opcion = 0;

        do {
            System.out.println("\n ¿Cual es el nombre?");
            String nombre = sc.next();
            System.out.println("¿Cuales son los apellidos?");
            String apellidos = sc.next();
            System.out.println("¿Cual es el sexo?");
            String sexo = sc.next();
            System.out.println("¿En que ciudad vive?");
            String ciudad = sc.next();
            System.out.println("¿Cual es su fecha de nacimiento?");
            String fechaNacimientoTexto = sc.next();
            Date fechaNacimiento = excep.validarFecha(fechaNacimientoTexto);

            System.out.println("¿Cual es su telefono?");
            String telefono = " ";
            try {
                telefono = excep.validarTelefono(sc.next());
                int telefono1 = Integer.parseInt(telefono);

            } catch (NumberFormatException  e){
                System.err.println("El telefono debe de ser numerico");
                err = true;
            } catch (DatoInvalidoException e) {
                err = true;
                System.err.println("El telefono debe de tener 9 digitos");
            }
            System.out.println("¿Cual es su email?");
            String email = " ";
            try {
                email = excep.validarEmail(sc.next());
            } catch (DatoInvalidoException e) {
                err = true;
                System.err.println("El formato del email no es correcto");
            }

            for(int i = 0 ; i <listadoClientes.size(); i++)
            {
                if(listadoClientes.get(i).getNombre().equalsIgnoreCase(nombre) && listadoClientes.get(i).getApellidos().equalsIgnoreCase(apellidos))
                {
                    campRepeat = true;
                    err = true;
                }
            }
            if(!err)
            {
                Cliente nuevoCliente = new Cliente(null,nombre,apellidos,sexo, ciudad,fechaNacimiento,telefono,email);
                clienteJPA.create(nuevoCliente);
                System.out.println("El cliente se ha creado correctamente");
            }
            else if (campRepeat == true)
            {
                System.err.println("Ese usuario esta en nuestra base de datos");
            }
            else
            {
                System.err.println("No se pudo crear porque hay errores");
            }
            String action = "1. Insertar otro cliente";
            opcion = returnMenu (sc,action);

        } while (opcion == 1);

    }

    public void listarClientes() {

        List<Cliente> listadoClientes = cargarClientes();
        System.out.println();
        if(listadoClientes.isEmpty())
        {
            System.err.println("no hay clientes en la base de datos");
        }
        else
        {
            for(Cliente cliente: listadoClientes)
            {
                System.out.println(cliente.toString());
            }
        }


    }

    public void ActualizarCliente(int sopcion, Scanner sc) {

        List<Cliente> listadoClientes = cargarClientes();
        System.out.println("\n¿Que cliente desea editar?\n");

        for (Cliente cliente : listadoClientes) {
            System.out.println(" -> " + cliente.toString());
        }
        int cActual = 0;

        boolean err = false;
        boolean exist = false;
        int opcion = 0;


        do {
            System.out.println("\n¿Que cliente desea editar?");
            String nombre = sc.next();


            for (int i = 0; i < listadoClientes.size(); i++) {
                if (listadoClientes.get(i).getNombre().equalsIgnoreCase(nombre)) {
                    exist = true;
                }
            }

            System.out.println();


            if (exist) {
                switch (sopcion) {
                    case 1:
                        System.out.println("Inserte el nuevo nombre");
                        break;
                    case 2:
                        System.out.println("Inserte los nuevos apellidos");
                        break;

                    case 3:
                        System.out.println("Inserte el nuevo sexo");
                        break;

                    case 4:
                        System.out.println("Inserte la nueva fecha de nacimiento");
                        break;

                    case 5:
                        System.out.println("Inserte el nuevo telefono");
                        break;
                    case 6:
                        System.out.println("Inserte el nuevo email");
                        break;
                }

                String datoNuevo = sc.next();

                switch (sopcion) {
                    case 1:
                        listadoClientes.get(cActual).setNombre(datoNuevo);
                        break;
                    case 2:
                        listadoClientes.get(cActual).setApellidos(datoNuevo);
                        break;

                    case 3:
                        listadoClientes.get(cActual).setSexo(datoNuevo);
                        break;

                    case 4:
                        Date fechaNacimiento = excep.validarFecha(datoNuevo);
                        if (fechaNacimiento == null) {
                            exist = true;
                        } else {
                            listadoClientes.get(cActual).setFechaNacimiento(fechaNacimiento);
                        }

                        break;

                    case 5:
                        try {
                            datoNuevo = excep.validarTelefono(sc.next());
                            listadoClientes.get(cActual).setTelefono(datoNuevo);

                        } catch (NumberFormatException e) {
                            exist = true;
                            System.err.println("El telefono debe de ser numerico");
                        } catch (DatoInvalidoException e) {
                            exist = true;
                            System.err.println("El telefono debe de tener 9 digitos");
                        }
                        break;
                    case 6:
                        try {
                            datoNuevo = excep.validarEmail(sc.next());
                            listadoClientes.get(cActual).setCorreoElectronico(datoNuevo);
                        } catch (DatoInvalidoException e) {
                            exist = true;
                            System.err.println("El formato del email no es correcto");
                        }

                        break;


                }
                if (exist) {
                    clienteJPA.update(listadoClientes.get(cActual));
                    System.out.println("El cliente se ha actualizado correctamente");
                } else {
                    System.err.println("hay errores en la actualización del cliente");
                }

            } else {
                System.err.println("no existe el cliente\n");
            }

            String action = "1. Actualizar otro cliente";
            opcion = returnMenu (sc,action);

        } while (opcion == 1);
    }


    public void EliminarCliente(Scanner sc) {

        List<Cliente>listadoClientes = cargarClientes();

        for(Cliente cliente: listadoClientes)
        {
            System.out.println(cliente.toString());
        }

        int opcion = 0;

        do{
            System.out.println("\n¿Cual es el nombre del cliente que quiere eliminar?");
            String nombre = sc.next();

            Cliente current = null;
            Integer idDelete =0;
            List<Cliente> clientesCoinciden = new ArrayList<>();

            for(int i = 0 ; i <listadoClientes.size(); i++)
            {
                if(listadoClientes.get(i).getNombre().equalsIgnoreCase(nombre))
                {
                    current = listadoClientes.get(i);
                    clientesCoinciden.add(listadoClientes.get(i));
                }
            }
            System.out.println(clientesCoinciden.size());

            if(clientesCoinciden.size() >1)
            {

                System.out.println("tenemos"+clientesCoinciden.size()+" coincidencias especifique los apellidos");
                String apellido = sc.next();

                for(int i = 0 ; i <listadoClientes.size(); i++)
                {
                    if(listadoClientes.get(i).getApellidos().equalsIgnoreCase(apellido))
                    {
                        current = listadoClientes.get(i);
                    }
                }
            }

            if(clientesCoinciden.isEmpty())
            {
                System.err.println("No se encontro cliente");
            }
            else
            {
                System.out.println("el cliente a borrar es "+ current.toString());
                idDelete = current.getId();
                clienteJPA.delete(idDelete);
                System.out.println("El cliente "+current.getNombre()+" Se ha borrado correctamente");
            }

            String action = "1. Borrar otro cliente";
            opcion = returnMenu (sc,action);

        } while (opcion == 1);



    }

    public void BuscarPorCiudad(Scanner sc) {

        int opcion = 0;
        boolean listaVacia = true;

        do{
            List<Cliente> listadoClientes = cargarClientes();

            System.out.println("\n¿De que ciudad quiere ver los clientes?");

            String ciudad = sc.next();


            for(int i = 0 ; i <listadoClientes.size(); i++)
            {
                if(listadoClientes.get(i).getCiudad().equalsIgnoreCase(ciudad))
                {
                    System.out.println(listadoClientes.get(i).getNombre());
                    listaVacia = false;
                }
            }

            if(listaVacia == true)
            {
                System.err.println("Ahora mismo no tenemos clientes en : "+ciudad);
            }
            String action = "1. Buscar clientes en otra ciudad";
            opcion = returnMenu (sc,action);

        } while (opcion == 1);

    }

    private int returnMenu(Scanner sc, String action) {


        int opcion=0;

        if (opcion < 0 || opcion > 6)
        {
            System.err.println("Opción no valida");
        }
        System.out.println("\n¿Que quiere hacer?:\n" +
                action + "\n"+
                "2. Salir");
        try{

            opcion = sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("No es un numero");
        }


        return  opcion;
    }
}
