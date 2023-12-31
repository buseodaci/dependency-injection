package com.example.dependencyinjection.dependencyinjectionwithspring.controller;

import com.example.dependencyinjection.dependencyinjectionwithspring.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    @Autowired
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        // use dependency.
        return greetingService.sayGreeting();
    }
}
