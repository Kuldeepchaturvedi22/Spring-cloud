package com.example.userservice.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private String phone;

    List<Contact> contacts = new ArrayList<>();

    public User(Long id, String name, String phone, List<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public User(String phone, String name, Long id) {
        this.phone = phone;
        this.name = name;
        this.id = id;
    }

    public User() {
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
