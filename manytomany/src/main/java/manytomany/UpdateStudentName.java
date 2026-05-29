//2. Update Student Name
package manytomany;

import javax.persistence.*;

public class UpdateStudentName {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytomany");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Student s = em.find(Student.class, 1);

        et.begin();
        s.setSname("updated_name");
        em.merge(s);
        et.commit();
    }
}