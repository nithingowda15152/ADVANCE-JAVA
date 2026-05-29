package com.second;

import org.springframework.stereotype.Component;

// Marks this class as a Spring Bean
@Component
public class Mobile {

    // Method to simulate mobile functionality
    public void text() {
        System.out.println("texting using mobile");
    }
}