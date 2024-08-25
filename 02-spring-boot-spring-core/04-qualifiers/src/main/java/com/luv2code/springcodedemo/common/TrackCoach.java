package com.luv2code.springcodedemo.common;
import org.springframework.stereotype.Component;
@Component
public class TrackCoach implements Coach{
@Override
public String getDailyWorkout(){
    return "Wear nice Tracks";
}
}
