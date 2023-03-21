package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    define a private field for the dependency
    private Coach myCoach;

//    define constructor for dependency
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach)
    {
        System.out.println("In constructor : " + getClass().getSimpleName());
        this.myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
    @PostConstruct
    public static void programStarted()
    {
        System.out.println("Program Started");
    }

    @PreDestroy
    public static void programEnded()
    {
        System.out.println("Program Ended");
    }

}