package com.example.userservice.service;

import com.example.userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {


    List<User> list = List.of(
            new User(1L, "John", "1234567890", null),
            new User(2L, "Jane", "0987654321", null),
            new User(3L, "Doe", "1230984567", null)
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getId().equals(id)).findAny().orElse(null);
    }
}
