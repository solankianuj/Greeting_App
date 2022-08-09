package com.example.greetingapp.services;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;

public interface IGreetingService {
    Greeting addGreeting();
    Greeting getGreetingById(Long id);
}
