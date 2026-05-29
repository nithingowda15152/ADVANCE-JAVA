package com.second;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    // Primitive and String variables
    int id;
    String name;
    double marks;

    
    // Constructor Injection
    public Student(
          @Value("103")
            int id,
          @Value("rose")
            String name,
          @Value("85.0")
            double marks) {

        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    // Setter Methods (for all variables)
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setMarks(double marks) {
//        this.marks = marks;
//    }

    // Display Method
    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}