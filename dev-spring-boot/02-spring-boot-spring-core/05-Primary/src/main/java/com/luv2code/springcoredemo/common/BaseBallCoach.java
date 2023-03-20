package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "spends 30 min in batting practice";
    }
}
