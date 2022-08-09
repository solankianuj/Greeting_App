package com.example.greetingapp.services;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    @Override
    public Greeting addGreeting() {
        AtomicLong atomicLong =new AtomicLong();
        Greeting greeting=new Greeting();
        greeting.setId(atomicLong.incrementAndGet());
        greeting.setMessage("Hello World");
        return greeting;
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return null;
    }
}
