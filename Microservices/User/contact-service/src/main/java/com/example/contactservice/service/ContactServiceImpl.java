package com.example.contactservice.service;

import com.example.contactservice.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class ContactServiceImpl implements ContactService {


    List<Contact> list = List.of(
            new Contact(10L, "John@gmail.com", "John", 1L),
            new Contact(20L, "Jane@gmail.com", "Jane", 1L),
            new Contact(30L, "Doe@gmail.com", "Doe", 2L),
            new Contact(40L, "Jon@gmail.com", "Jon", 2L)
    );

    @Override
    public List<Contact> getUser(Long userid) {
        return list.stream().filter(contact -> contact.getUserId().equals(userid)).collect(Collectors.toList());
    }
}
