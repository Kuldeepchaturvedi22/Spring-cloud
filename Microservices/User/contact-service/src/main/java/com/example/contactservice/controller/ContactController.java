package com.example.contactservice.controller;

import com.example.contactservice.entity.Contact;
import com.example.contactservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/{userId}")
    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
        return this.contactService.getUser(userId);
    }

}
