package com.example.dependencyinjection.dependencyinjectionwithspring.controller;

import com.example.dependencyinjection.dependencyinjectionwithspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldInjectionController {
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
