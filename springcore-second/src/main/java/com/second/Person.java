package com.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Marks this class as a Spring Bean
@Component
public class Person {

    // Reference variable (HAS-A relationship)
    Mobile mob;

    /*
     * Constructor Injection
     * Spring automatically injects Mobile object here
     */
    @Autowired
    public Person(Mobile mob) {
        this.mob = mob;
    }

    /*
     * Setter Injection (optional - alternative way)
     * Uncomment if you want to use setter injection instead
     */
    /*
    @Autowired
    public void setMob(Mobile mob) {
        this.mob = mob;
    }
    */

    // Method to use mobile
    public void use() {
        System.out.println("Person is using mobile");
    }
}