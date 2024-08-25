package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run Everyday!!";
    }

    //expose a new endpoint for fortune

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day";
    }
    
}
