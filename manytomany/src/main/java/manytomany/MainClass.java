package manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();

        // many course
        Course c1 = new Course();
        c1.setCname("core java");
        c1.setDuration(50);

        Course c2 = new Course();
        c2.setCname("sql");
        c2.setDuration(30);

        Course c3 = new Course();
        c3.setCname("advance java");
        c3.setDuration(40);

        // many student
        Student s1 = new Student();
        s1.setSname("tom");
        s1.setPhono(9876543214L);

        Student s2 = new Student();
        s2.setSname("jerry");
        s2.setPhono(9123456785L);

        // set course for student
        List<Course> list = new ArrayList<Course>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        s1.setCourseList(list);
        s2.setCourseList(list);

        // save all
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(s1);
        em.persist(s2);

        et.commit();
    }
}