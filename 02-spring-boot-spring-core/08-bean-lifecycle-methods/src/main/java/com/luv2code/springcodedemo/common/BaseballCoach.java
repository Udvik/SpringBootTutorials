package com.luv2code.springcodedemo.common;


import org.springframework.stereotype.Component;
@Component
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("Baseball constructor");
    }

    @Override
    public String getDailyWorkout(){
    return "Spend 30min in batting practice";
}
}
