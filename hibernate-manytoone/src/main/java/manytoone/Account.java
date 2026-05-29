package manytoone;

import javax.persistence.*;

@Entity
@Table(name = "account_details")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;

    @Column(name = "account_name", unique = true, nullable = false)
    private String aname;

    @Column(unique = true)
    private double balance;

    // Many accounts belong to one bank
    @ManyToOne
    private Bank bank;

    // Getters & Setters

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}