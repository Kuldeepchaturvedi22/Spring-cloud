package com.kuldeep.Demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;
    private String aname;

    public Alien(String aname, int aid) {
        this.aname = aname;
        this.aid = aid;
    }

    public Alien() {

    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public void setAid(int aid) {
        this.aid = aid;
    }
}
