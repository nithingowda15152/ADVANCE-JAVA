//5. Set courses null → update → delete student
package manytomany;

import javax.persistence.*;

public class DeleteStudent {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s = em.find(Student.class, 1);

        et.begin();

        // remove relationship first
        s.setCourseList(null);
        em.merge(s);

        // delete student
        em.remove(s);

        et.commit();
    }
}