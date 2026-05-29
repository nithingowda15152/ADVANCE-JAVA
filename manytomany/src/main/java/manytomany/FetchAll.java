//4. Fetch all Students and Courses
package manytomany;

import javax.persistence.*;
import java.util.List;

public class FetchAll {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();

        // fetch all students
        Query q = em.createQuery("select s from Student s");
        List<Student> students = q.getResultList();

        for (Student s : students) {
            System.out.println("Student: " + s.getSname());

            List<Course> courses = s.getCourseList();

            for (Course c : courses) {
                System.out.println("   Course: " + c.getCname() + " | Duration: " + c.getDuration());
            }
        }
    }
}