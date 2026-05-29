//1. Find one Student + print details + courses
package manytomany;

import javax.persistence.*;
import java.util.List;

public class FindOneStudent {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();

        // fetch student
        Student s = em.find(Student.class, 1);

        System.out.println("Student ID: " + s.getSid());
        System.out.println("Student Name: " + s.getSname());
        System.out.println("Phone: " + s.getPhono());

        // fetch courses
        List<Course> list = s.getCourseList();

        for (Course c : list) {
            System.out.println("Course ID: " + c.getCid());
            System.out.println("Course Name: " + c.getCname());
            System.out.println("Duration: " + c.getDuration());
            System.out.println("---------------------");
        }
    }
}