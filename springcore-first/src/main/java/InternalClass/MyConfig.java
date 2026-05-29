package InternalClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // Marks this class as Spring Configuration
public class MyConfig {

    // Scanner Bean
    @Bean
    public Scanner gets() {
        return new Scanner(System.in);
    }
    @Bean
    public Scanner getsca() {
        return new Scanner(System.in);
    }

    // Integer Bean
    @Bean
    public Integer getI() {
        return Integer.valueOf(10);
    }

    // ArrayList Bean
    @Bean
    public ArrayList<String> getList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        return list;
    }

    // HashSet Bean
    @Bean
    public HashSet<Integer> getSet() {
        HashSet<Integer> set = new HashSet<>();
        set.add(100);
        set.add(200);
        return set;
    }

    // Set Bean (Interface type)
    @Bean
    public Set<String> getSetData() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Hibernate");
        return set;
    }

    // Map Bean
    @Bean
    public Map<Integer, String> getMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        return map;
    }

    // RuntimeException Bean
    @Bean
    public RuntimeException getEx() {
        return new RuntimeException("This is Runtime Exception Bean");
    }
}

/*
 * Notes:
 * 1. We can create objects for predefined classes using Spring.
 * 
 * 2. How?
 *    - Create a method that creates and returns an object.
 *    - Annotate that method with @Bean.
 * 
 * 3. The method name can be anything.
 * 
 * 4. Spring Container will automatically call these methods
 *    and manage the returned objects as beans.
 */