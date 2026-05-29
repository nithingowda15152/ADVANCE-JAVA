package com.onetoone;

import java.util.Scanner;
import javax.persistence.*;

public class StoreData {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone-task");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter Engine details");

            Engine e = new Engine();
            System.out.print("Enter Engine ID: ");
            e.setEid(sc.nextInt());

            System.out.print("Enter Engine Type: ");
            e.setType(sc.next());

            System.out.print("Enter Engine CC: ");
            e.setCc(sc.nextInt());

            System.out.println("Enter Car details");

            Car c = new Car();
            System.out.print("Enter Car ID: ");
            c.setCid(sc.nextInt());

            System.out.print("Enter Car Brand: ");
            c.setBrand(sc.next());

            System.out.print("Enter Car Cost: ");
            c.setCost(sc.nextDouble());

            // relation
            c.setEng(e);

            em.persist(e);
            em.persist(c);

            System.out.println("Saved Successfully\n");
        }

        et.commit();
        sc.close();
    }
}