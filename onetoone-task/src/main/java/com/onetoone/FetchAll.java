package com.onetoone;

import java.util.List;
import javax.persistence.*;

public class FetchAll {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone-task");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("select c from Car c");
        List<Car> list = q.getResultList();

        if (list.isEmpty()) {
            System.out.println("No records found");
        } else {

            for (Car c : list) {

                System.out.println("Car ID: " + c.getCid());
                System.out.println("Brand: " + c.getBrand());
                System.out.println("Cost: " + c.getCost());

                Engine e = c.getEng();

                if (e != null) {
                    System.out.println("Engine ID: " + e.getEid());
                    System.out.println("Type: " + e.getType());
                    System.out.println("CC: " + e.getCc());
                } else {
                    System.out.println("Engine not found");
                }

                System.out.println("----------------------");
            }
        }
    }
}