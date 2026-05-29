package com.first;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Person Bean
@Component
public class Person {

    // HAS-A relationships
    Mobile mob;
    Laptop laptop;
    Scanner sc;
    ArrayList<String> list;
    Set<Integer> set;

    // Constructor Injection
    @Autowired
    public Person(Mobile mob, Laptop laptop, Scanner sc,
                  ArrayList<String> list, Set<Integer> set) {

        this.mob = mob;
        this.laptop = laptop;
        this.sc = sc;
        this.list = list;
        this.set = set;
    }

    // Method
    public void use() {
        System.out.println("Person is using mobile");
        mob.text();

        System.out.println("Person is using laptop");
        laptop.work();
    }
}