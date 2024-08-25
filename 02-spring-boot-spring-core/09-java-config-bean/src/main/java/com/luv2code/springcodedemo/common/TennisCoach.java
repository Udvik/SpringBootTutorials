package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;
@Component

public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("TennisCoach constructor");
    }
@Override
public String getDailyWorkout(){
    return "Spend 40min in backhand volley";
}
}
