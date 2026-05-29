package com.onetoone;

import java.util.Scanner;
import javax.persistence.*;

public class DeleteBoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone-task");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        System.out.print("Enter Car ID to delete: ");
        int id = sc.nextInt();

        Car c = em.find(Car.class, id);

        if (c != null) {

            Engine e = c.getEng();

            et.begin();

            em.remove(c);   // delete car
            if (e != null) {
                em.remove(e);   // delete engine
            }

            et.commit();

            System.out.println("Car and Engine deleted successfully");

        } else {
            System.out.println("Car not found");
        }

        sc.close();
    }
}