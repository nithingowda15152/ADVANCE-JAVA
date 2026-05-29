package com.onetoone;

import java.util.Scanner;
import javax.persistence.*;

public class UpdateCarCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoone-task");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        System.out.print("Enter Car ID to update: ");
        int id = sc.nextInt();

        Car c = em.find(Car.class, id);

        if (c != null) {

            System.out.println("Old Cost: " + c.getCost());

            System.out.print("Enter New Cost: ");
            double newCost = sc.nextDouble();

            et.begin();
            c.setCost(newCost);
            et.commit();

            System.out.println("Car cost updated successfully");

        } else {
            System.out.println("Car not found");
        }

        sc.close();
    }
}