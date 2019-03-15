package com.example.greeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

@Autowired
private BasicConfiguration configuration;

    @GetMapping("/")
    public String greet()
    {
        return configuration.getMessage();
    }
}
