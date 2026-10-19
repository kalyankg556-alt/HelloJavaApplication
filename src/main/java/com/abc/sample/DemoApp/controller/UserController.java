package com.abc.sample.DemoApp.controller;

import com.abc.sample.DemoApp.model.User;
import com.abc.sample.DemoApp.service.UserService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @PostMapping
    public void postUser(@RequestBody User user) {
        // store the new record and perform some business logic
    }

    @PutMapping
    public void putUser(@RequestBody User user) {
        // To update an existing record
    }

    @DeleteMapping
    public void delete(@RequestParam("id") String id) {
        // Delete the record
        System.out.println("delete the user");
    }

    @PostMapping("/routers/{routerMacAddress}/activateWifi/{code}")
    public void activeWifi(@PathParam("routerMacAddress") String routerMacAddress,
                           @PathParam("code") String code) {

    }

    @GetMapping("/filterByAge")
    public List<User> filterByAge(@RequestParam("age") String age) {
        int age1  = Integer.parseInt(age);
        return this.userService.filterByAge(age1);
    }
}
