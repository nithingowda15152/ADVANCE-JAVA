package com.first;

import org.springframework.stereotype.Component;

// Marks this class as Spring Bean
@Component
public class Mobile {
    public void text() {
        System.out.println("texting using mobile");
    }
}