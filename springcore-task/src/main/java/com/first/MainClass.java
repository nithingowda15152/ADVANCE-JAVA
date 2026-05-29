package com.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        // Start Spring Container
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext("com.first");

        // Get Person Bean
        Person p = app.getBean(Person.class);

        // Use methods
        p.use();

        // Scanner usage
        System.out.println("Enter something:");
        String input = p.sc.nextLine();
        System.out.println("You entered: " + input);

        // ArrayList values
        System.out.println("ArrayList values:");
        for (String s : p.list) {
            System.out.println(s);
        }

        // Set values
        System.out.println("Set values:");
        for (Integer i : p.set) {
            System.out.println(i);
        }
    }
}