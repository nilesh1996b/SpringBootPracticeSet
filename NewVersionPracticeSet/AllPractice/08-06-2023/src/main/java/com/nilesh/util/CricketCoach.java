package com.nilesh.util;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Cricket Started : " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Do Batting Practice for 15 minutes";

    }
}
