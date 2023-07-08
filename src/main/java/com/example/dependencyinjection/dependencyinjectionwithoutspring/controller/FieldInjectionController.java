package com.example.dependencyinjection.dependencyinjectionwithoutspring.controller;

import com.example.dependencyinjection.dependencyinjectionwithoutspring.services.GreetingService;

public class FieldInjectionController {
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
