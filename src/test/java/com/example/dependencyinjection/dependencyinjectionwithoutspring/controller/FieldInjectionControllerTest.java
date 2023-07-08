package com.example.dependencyinjection.dependencyinjectionwithoutspring.controller;

import com.example.dependencyinjection.dependencyinjectionwithoutspring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FieldInjectionControllerTest {

    FieldInjectionController fieldInjectionController;

    @BeforeEach
    void setUp() {
        fieldInjectionController = new FieldInjectionController();
        fieldInjectionController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void sayHello() {
        System.out.println(fieldInjectionController.sayHello());
    }
}