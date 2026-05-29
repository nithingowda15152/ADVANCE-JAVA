package manytoone;

import javax.persistence.*;

public class MainClass {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // Create Bank
        Bank b = new Bank();
        b.setBname("SBI");
        b.setBranch("Bangalore");

        // Create Accounts
        Account a1 = new Account();
        a1.setAname("John");
        a1.setBalance(5000);

        Account a2 = new Account();
        a2.setAname("Smith");
        a2.setBalance(8000);

        // Set relation (FK)
        a1.setBank(b);
        a2.setBank(b);

        et.begin();

        em.persist(b);
        em.persist(a1);
        em.persist(a2);

        et.commit();
    }
}