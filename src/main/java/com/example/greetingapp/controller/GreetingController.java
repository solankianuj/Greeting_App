package com.example.greetingapp.controller;
import com.example.greetingapp.model.Greeting;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    AtomicLong atomicLong =new AtomicLong();

    @RequestMapping(value = "/getGreet")
    public Greeting getString()
    {
        Greeting greeting=new Greeting();
        greeting.setId(atomicLong.incrementAndGet());
        greeting.setMessage("hello world");

        return greeting ;
    }

    @RequestMapping(value = "/getGreeting")
    public Greeting getString1(@RequestParam(value = "greeting") String Greet )
    {
        Greeting greeting=new Greeting();
        greeting.setMessage(Greet);
        greeting.setId(atomicLong.incrementAndGet());
        return greeting ;
    }

    @RequestMapping(value = "/getgreet/{Greet}")
    public Greeting getString2(@PathVariable String Greet )
    {
        Greeting greeting=new Greeting();
        greeting.setMessage(Greet+" "+"World");
        greeting.setId(atomicLong.incrementAndGet());
        return greeting;
    }

    @PostMapping("/post")
    public Greeting getString3(@RequestBody Greeting greet )

    {   greet.setMessage("hello Wolrd");
        greet.setId(atomicLong.incrementAndGet());
        return greet;
    }

    @PutMapping("/put/{string1}")
    public Greeting getGreeting4( @PathVariable String string1,@RequestParam(value = "greeting")  String greeting)
    {
        Greeting greet=new Greeting();
        greet.setId(atomicLong.incrementAndGet());
        greet.setMessage(string1+" "+greeting);

        return greet;


    }


}
