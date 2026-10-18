package com.abc.sample.DemoApp.service;

import com.abc.sample.DemoApp.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBuilderService {

    public List<User> getDummyUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", 25));
        users.add(new User(2, "David", 30));
        users.add(new User(3, "Michael", 28));
        users.add(new User(4, "Sarah", 24));
        users.add(new User(5, "Emma", 27));
        users.add(new User(6, "Daniel", 32));
        users.add(new User(7, "Sophia", 26));
        users.add(new User(8, "James", 35));
        users.add(new User(9, "Olivia", 29));
        users.add(new User(10, "Robert", 31));
        users.add(new User(11, "Emily", 23));
        users.add(new User(12, "William", 34));
        users.add(new User(13, "Ava", 22));
        users.add(new User(14, "Joseph", 36));
        users.add(new User(15, "Mia", 28));
        users.add(new User(16, "Thomas", 33));
        users.add(new User(17, "Isabella", 27));
        users.add(new User(18, "Charles", 40));
        users.add(new User(19, "Charlotte", 26));
        users.add(new User(20, "Henry", 29));
        return users;
    }
}
