package com.luv2code.springcodedemo.common;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("CricketCoach constructor");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("In doMyStartupStuff(): "+getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("In the doMyCleanupStuff() "+getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout(){
        return "Practice bowling for 15min";
    }
}
