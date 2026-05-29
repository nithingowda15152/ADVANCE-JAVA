package com.first;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Configuration class
@Configuration
public class MyConfig {

    // Scanner Bean
    @Bean
    public Scanner getScanner() {
        return new Scanner(System.in);
    }

    // ArrayList Bean with values
    @Bean
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");
        return list;
    }

    // Set Bean with values
    @Bean
    public Set<Integer> getSet() {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        return set;
    }
}