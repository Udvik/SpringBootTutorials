package com.luv2code.springcodedemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luv2code.springcodedemo.common.Coach;
import com.luv2code.springcodedemo.common.SwimCoach;

@Configuration
public class SportConfig {
    

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
