package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // -------- Create Products --------
        Product p1 = new Product();
        p1.setPname("biscuit");
        p1.setPrice(100.0);

        Product p2 = new Product();
        p2.setPname("ice cream");
        p2.setPrice(350.0);

        Product p3 = new Product();
        p3.setPname("chocolate");
        p3.setPrice(210.0);

        // -------- Create Shop --------
        Shop sh = new Shop();
        sh.setSname("abc mart");
        sh.setAddress("bengaluru");

        // -------- Add products to list --------
        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        // -------- Set list to shop --------
        sh.setProductList(list);

        // -------- Save Data --------
        et.begin();

        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(sh);

        et.commit();

    }
}