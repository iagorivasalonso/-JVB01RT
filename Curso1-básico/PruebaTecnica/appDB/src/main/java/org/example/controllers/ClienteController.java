package org.example.controllers;

import org.example.entities.Cliente;
import org.example.persistence.ClienteJPA;

import java.util.List;


public class ClienteController {

     ClienteJPA clienteJPA = new ClienteJPA();



    public List<Cliente> findAll() {

        return clienteJPA.findAll();
    }

    public void create(Cliente nuevoCliente) {

        clienteJPA.create(nuevoCliente);
    }

    public Cliente findOne(Integer idBuscado) {

       return clienteJPA.findOne(idBuscado);
    }


    public void update(Cliente clienteActualizar) {

        clienteJPA.update(clienteActualizar);
    }

    public void delete(Integer idDelete) {

        clienteJPA.delete(idDelete);
    }

    public void filterByName(String nombre1) {

        List<Cliente> listaClientes = clienteJPA.findAll();

        for(Cliente cliente:listaClientes){
            if(cliente.getNombre().equalsIgnoreCase(nombre1)){
                System.out.println(cliente);
            }
        }
    }
}
