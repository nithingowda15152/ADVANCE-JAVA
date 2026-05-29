package onetomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FindData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // find product - product alone will come
        Product p1 = em.find(Product.class, 1);

        if (p1 != null) {
            System.out.println(p1.getPid() + " " + p1.getPname() + " " + p1.getPrice());
        } else {
            System.out.println("Product id not available");
        }

        System.out.println("--------------------------------");

        // find shop
        Shop sh = em.find(Shop.class, 1);

        if (sh != null) {
            System.out.println(sh.getSid() + " " + sh.getSname() + " " + sh.getAddress());

            List<Product> list = sh.getProductList();

            if (list != null) {
                for (Product p : list) {
                    System.out.println(p.getPid() + " " + p.getPname() + " " + p.getPrice());
                }
            } else {
                System.out.println("Product id not available");
            }

        } else {
            System.out.println("Shop id not available");
        }

        // find shop --- both shop and product data comes
        et.begin();
        et.commit();
    }
}