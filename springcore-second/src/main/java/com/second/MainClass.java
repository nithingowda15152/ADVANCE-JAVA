package com.second;

// Import Spring container
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        // Create Spring Container
        // It scans the given package for @Component classes
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext("com.second");

        // Get Student object (bean) from Spring container
        Student s = app.getBean(Student.class);

        // Call method
        s.display();
        
        // Get Person Bean
        Person p = app.getBean(Person.class);

        // Call method
        p.use();

        // Print injected Mobile object reference
        System.out.println(p.mob);

        // Store mobile object in another variable
        Mobile m = p.mob;

        // Call method of Mobile
        m.text();
    }
}