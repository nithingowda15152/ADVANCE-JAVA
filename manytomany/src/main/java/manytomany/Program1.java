//Updating-(New Student with Existing Courses)
package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Program1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        // new student with old courses
        Student s = new Student();
        s.setSname("rose");
        s.setPhono(9856321475L);

        // fetch existing courses (only core java and advance java)
        Course c1 = em.find(Course.class, 1);
        Course c2 = em.find(Course.class, 3);

        // create new list
        List<Course> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);

        // set courses to student
        s.setCourseList(list);

        // save student
        em.persist(s);

        et.commit();
    }
}