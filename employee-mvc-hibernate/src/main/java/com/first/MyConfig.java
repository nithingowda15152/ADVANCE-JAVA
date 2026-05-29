package com.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@Configuration
@ComponentScan(basePackages = "com.first")
public class MyConfig {

    @Bean
    public EntityManagerFactory getEMF() {
        return Persistence.createEntityManagerFactory("mvc-hibernate");
    }
}