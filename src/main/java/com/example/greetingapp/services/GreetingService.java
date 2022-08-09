package com.example.greetingapp.services;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{
    AtomicLong atomicLong =new AtomicLong();
    @Override
    public Greeting addGreeting(User user) {

        Greeting greeting=new Greeting();
        greeting.setId(atomicLong.incrementAndGet());
        greeting.setMessage("Hello"+" "+user.toString());
        return greeting;
    }

    @Override
    public Greeting getGreetingById(Long id) {
        return null;
    }
}
