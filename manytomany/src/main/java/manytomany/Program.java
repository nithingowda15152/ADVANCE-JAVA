//Updating-(New course with Existing student)
package manytomany;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Program {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // for old student add new course

        // fetch old student -- has already one list [core java, sql, advance java]
        Student st = em.find(Student.class, 1);

        // create new course
        Course co = new Course();
        co.setCname("html");
        co.setDuration(25);

        // set this course to that student in list format
        // fetch old list only
        List<Course> oldList = st.getCourseList();

        // add new course
        oldList.add(co);

        // set list to student
        st.setCourseList(oldList);

        // save course
        em.persist(co);

        // update student
        em.merge(st);

        et.begin();
        et.commit();
    }
}