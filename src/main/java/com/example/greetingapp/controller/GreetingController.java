package com.example.greetingapp.controller;
import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.model.User;
import com.example.greetingapp.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingController {

    @Autowired
    private IGreetingService greetingService;

    @GetMapping(value = "/getGreet")
    public Greeting getGreeting( @RequestParam(value = "fName",defaultValue = "world") String fName)
    {
        User user=new User();
        user.setFName(fName);
        return greetingService.addGreeting(user) ;
    }


}
