package com.abc.sample.DemoApp.service;

import com.abc.sample.DemoApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserBuilderService userBuilderService;

    public List<User> getAllUsers() {
        return this.userBuilderService.getDummyUsers();
    }

    public List<User> filterByAge(int age) {
        List<User> users = this.userBuilderService.getDummyUsers();
        users = users.stream().filter(u -> u.getAge() == age).toList();
        return users;
    }
}
