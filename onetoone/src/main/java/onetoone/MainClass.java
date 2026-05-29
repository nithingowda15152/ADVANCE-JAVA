package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Engine eg = new Engine();
        eg.setEid(1);
        eg.setType("petrol");
        eg.setCc(1200);

        Car ca = new Car();
        ca.setCid(101);
        ca.setBrand("kia");
        ca.setCost(1200000);

        // setting relation (FK)
        ca.setEng(eg);

        et.begin();

        // save both
        em.persist(eg);
        em.persist(ca);

        et.commit();
    }
}