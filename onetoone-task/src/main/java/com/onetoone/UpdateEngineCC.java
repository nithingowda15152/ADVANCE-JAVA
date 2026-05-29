package com.onetoone;

import java.util.Scanner;
import javax.persistence.*;

public class UpdateEngineCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone-task");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        Car c = em.find(Car.class, id);
        if (c != null) {
            Engine e = c.getEng();
            if (e != null) {
                System.out.println("Old CC: " + e.getCc());
                System.out.print("Enter New CC: ");
                int newCC = sc.nextInt();
                et.begin();
                e.setCc(newCC);
                et.commit();
                System.out.println("Engine CC updated successfully");
            } else {
                System.out.println("Engine not found");
            }
        } else {
            System.out.println("Car not found");
        }
        sc.close();
    }
}