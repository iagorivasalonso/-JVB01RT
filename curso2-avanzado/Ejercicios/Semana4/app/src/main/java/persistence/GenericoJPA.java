package persistence;

import jakarta.persistence.*;

import java.util.List;

public class GenericoJPA <T, ID>{

    private final Class<T> entityClass;

    public GenericoJPA(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create( T entity){

        EntityManager em = ConfigJPA.getEntityManager();

        try{
             em.getTransaction().begin();
             em.persist(entity);
             em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<T> findAll() {

        EntityManager em = ConfigJPA.getEntityManager();

        try{
            TypedQuery <T> query = em.createQuery("SELECT e FROM "+ entityClass.getSimpleName() +" e" ,entityClass);
            return query.getResultList();
        } finally {
            em.close();
        }

    }
}
