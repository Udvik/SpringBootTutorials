package com.luv2code.springcodedemo.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("TennisCoach constructor");
    }
@Override
public String getDailyWorkout(){
    return "Spend 40min in backhand volley";
}
}
