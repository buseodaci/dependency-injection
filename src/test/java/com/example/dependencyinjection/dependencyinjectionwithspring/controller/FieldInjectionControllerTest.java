package com.example.dependencyinjection.dependencyinjectionwithspring.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FieldInjectionControllerTest {

    @Autowired
    FieldInjectionController fieldInjectionController;

    @Test
    void sayHello() {
        System.out.println(fieldInjectionController.sayHello());
    }
}