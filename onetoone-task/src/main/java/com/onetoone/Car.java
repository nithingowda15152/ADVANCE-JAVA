package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {

    @Id
    private int cid;
    private String brand;
    private double cost;

    @OneToOne
    private Engine eng;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
}