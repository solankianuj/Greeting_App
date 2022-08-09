package com.example.greetingapp.controller;
import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @RequestMapping(value = "/getGreet")
    public Greeting getGreeting()
    {
        return greetingService.addGreeting() ;
    }


}
