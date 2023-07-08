package com.example.dependencyinjection.dependencyinjectionwithspring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimaly implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from primary service!!";
    }
}
