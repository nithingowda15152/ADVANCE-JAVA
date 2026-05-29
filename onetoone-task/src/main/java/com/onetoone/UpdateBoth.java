package com.onetoone;

import java.util.Scanner;
import javax.persistence.*;

public class UpdateBoth {
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
            System.out.println("Old Car Cost: " + c.getCost());
            System.out.print("Enter New Car Cost: ");
            double newCost = sc.nextDouble();

            System.out.println("Old Engine CC: " + e.getCc());
            System.out.print("Enter New Engine CC: ");
            int newCC = sc.nextInt();

            et.begin();

            c.setCost(newCost);
            e.setCc(newCC);

            et.commit();

            System.out.println("Car cost and Engine CC updated successfully");

        } else {
            System.out.println("Car not found");
        }

        sc.close();
    }
}