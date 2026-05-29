package manytoone;

import javax.persistence.*;

public class FindData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("manytoone");
        EntityManager em = emf.createEntityManager();

        // Find Account
        Account a = em.find(Account.class, 1);

        if (a != null) {
            System.out.println(a.getAid() + " " + a.getAname() + " " + a.getBalance());

            // Fetch Bank from Account
            Bank b = a.getBank();

            if (b != null) {
                System.out.println(b.getBid() + " " + b.getBname() + " " + b.getBranch());
            }

        } else {
            System.out.println("Account not found");
        }
    }
}