package com.nilesh.util;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach() {
        System.out.println("BaseBall Started : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do Running for 2 hour";

    }
}
