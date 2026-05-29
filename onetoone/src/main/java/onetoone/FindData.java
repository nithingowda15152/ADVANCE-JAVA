package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // find engine only
        Engine e = em.find(Engine.class, 1);
        if (e != null) {
            System.out.println(e.getCc() + " " + e.getType());
        } else {
            System.out.println("engine id not available");
        }

        System.out.println("----------------------------");

        // find car (both car + engine)
        Car c = em.find(Car.class, 101);
        if (c != null) {
            System.out.println(c.getBrand() + " " + c.getCost());

            Engine e1 = c.getEng();
            if (e1 != null) {
                System.out.println(e1.getCc() + " " + e1.getType());
            } else {
                System.out.println("engine id not available");
            }
        } else {
            System.out.println("car id not available");
        }

        et.begin();
        et.commit();
    }
}