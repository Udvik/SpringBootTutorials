package com.luv2code.springcodedemo.common;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
    public TrackCoach(){
        System.out.println("TrackCoach constructor");
    }
@Override
public String getDailyWorkout(){
    return "Wear nice Tracks";
}
}
