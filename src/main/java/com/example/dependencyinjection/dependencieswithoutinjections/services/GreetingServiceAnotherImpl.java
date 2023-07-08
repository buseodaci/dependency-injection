package com.example.dependencyinjection.dependencieswithoutinjections.services;

public class GreetingServiceAnotherImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Another Service!!!";
    }
}
