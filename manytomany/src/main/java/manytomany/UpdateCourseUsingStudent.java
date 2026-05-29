//3. Update First Course Duration using Student object
package manytomany;

import javax.persistence.*;
import java.util.List;

public class UpdateCourseUsingStudent {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s = em.find(Student.class, 1);

        // get first course
        List<Course> list = s.getCourseList();
        Course c = list.get(0);

        et.begin();
        c.setDuration(100); // updated duration
        em.merge(c);
        et.commit();
    }
}