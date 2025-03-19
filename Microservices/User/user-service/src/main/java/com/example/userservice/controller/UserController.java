package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId) {

        User user = this.userService.getUser(userId);

        List contacts = this.restTemplate.getForObject("http://contact-service/contact/" + user.getId(), List.class);

        user.setContacts(contacts);
        return user;

//        return userService.getUser(userId);

    }

}
