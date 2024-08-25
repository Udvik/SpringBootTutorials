package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Practice bowling for 15min";
    }
}
