package com.example.greetingapp.controller;


import com.example.greetingapp.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @RequestMapping(value = "getGreet")
    public User getString(){
        User user= new User();
        user.setFName("Anuj");
        user.setLName("Solanki");

        return user;
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public User getString1(@RequestParam(value = "fName") String fName){
        User user= new User();
        user.setFName(fName);
        user.setLName("Solanki");
        return user;
    }

    @GetMapping("param/{lName}")
    public User getString2(@PathVariable String lName){
        User user=new User();
        user.setFName("Anuj");
        user.setLName(lName);
        return user;
    }

    @PostMapping("/post")
    public User getString3(@RequestBody User user){
        user.setFName("anuj");
        user.setLName("solanki");
        return user;

    }

    @PutMapping("/put/{fName}" )
    public User getString4(@PathVariable String fName,@RequestParam(value = "lName") String lName ){

        User user=new User();
        user.setFName(fName);
        user.setLName(lName);

        return user;
    }
}
