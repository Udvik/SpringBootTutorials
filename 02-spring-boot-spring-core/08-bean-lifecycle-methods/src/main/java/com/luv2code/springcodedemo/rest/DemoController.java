package com.luv2code.springcodedemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcodedemo.common.Coach;


@RestController
public class DemoController {
    

    //define a private field for the dependency

    private Coach myCoach;

    @Autowired
    public  DemoController(@Qualifier("cricketCoach") Coach theCoach){
        System.out.println("In Constructor: "+getClass().getSimpleName());
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    
    
}
