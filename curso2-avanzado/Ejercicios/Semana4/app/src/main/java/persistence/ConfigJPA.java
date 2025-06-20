package persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConfigJPA {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");

    public static  EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void close () {
        emf.close();
    }
}
