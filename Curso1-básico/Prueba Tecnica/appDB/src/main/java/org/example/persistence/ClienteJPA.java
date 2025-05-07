package org.example.persistence;


import jakarta.persistence.EntityManager;

import java.util.List;

public class ClienteJPA {


    public List<Cliente> findAll() {

        EntityManager em = ConfigJPA.getEntityManager();

        try{

            TypedQuery <Cliente> query = em.createQuery("SELECT c FROM clientes c", Cliente.class);

            return query.getResultList();

        } finally {
            em.close();
        }
    }

    public void create(Cliente nuevoCliente) {

        EntityManager em = ConfigJPA.getEntityManager();

        try{
            em.getTransaction().begin();
            em.persist(nuevoCliente);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public Cliente findOne(Integer idBuscado) {

        EntityManager em = ConfigJPA.getEntityManager();

        try{
            return em.find(Cliente.class,idBuscado);
        }finally {
            em.close();
        }
    }


    public void update(Cliente clienteActualizar) {
        System.out.println("esta actualizando"+clienteActualizar);
        EntityManager em = ConfigJPA.getEntityManager();

        try{
            em.getTransaction().begin();
            em.merge(clienteActualizar);
            em.getTransaction().commit();
        }finally {
            em.close();
        }
    }

    public void delete(Integer idDelete) {

        EntityManager em = ConfigJPA.getEntityManager();
        Cliente clienteEncontrado = em.find(Cliente.class,idDelete);

        try{
            em.getTransaction().begin();

            if(clienteEncontrado != null)
            {
                 em.remove(clienteEncontrado);
            }
            else
            {
                System.out.println("El cliente  con id: " +idDelete+ " no existe");
            }
            em.getTransaction().commit();

        }finally {
            em.close();
        }

    }
}
