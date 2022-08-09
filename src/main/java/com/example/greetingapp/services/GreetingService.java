package com.example.greetingapp.services;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public Greeting addGreeting() {
        Greeting greeting=new Greeting();
        greeting.setGreeting("Hello World....");
        return greeting;
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return null;
    }
}
