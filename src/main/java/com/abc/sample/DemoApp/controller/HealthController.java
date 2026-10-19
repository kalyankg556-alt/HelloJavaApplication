package com.abc.sample.DemoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping
    public String health() {
        return "Application is working fine";
    }

    @GetMapping("/server-details")
    public String getServerDetails() {
        return "Server name  - 123455";
    }
}
