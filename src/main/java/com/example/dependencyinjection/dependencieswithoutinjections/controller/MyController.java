package com.example.dependencyinjection.dependencieswithoutinjections.controller;

import com.example.dependencyinjection.dependencieswithoutinjections.services.GreetingService;
import com.example.dependencyinjection.dependencieswithoutinjections.services.GreetingServiceImpl;
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        // the controller has all the control as to how that greeting service is created and how it is managed.
        this.greetingService = new GreetingServiceImpl();
        // this.greetingService = new GreetingServiceAnotherImpl();
    }

    public String sayHello() {
        System.out.println("Im in the controller");
        return greetingService.sayGreeting();
    }
}
