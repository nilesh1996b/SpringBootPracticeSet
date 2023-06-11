package com.nilesh.practice002.controller;

import com.nilesh.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private Coach myCoach;

    @Autowired
    public MyController(@Qualifier("cricketCoach") Coach myCoach)
    {
        this.myCoach = myCoach;
    }


    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/hi")
    public String sayHello()
    {
        return "Hello EveryOne";
    }

    @GetMapping("/values")
    public String getValues()
    {
        return "My Coach name is " + coachName + " and my team name is " + teamName;
    }


    @GetMapping("/coach")
    public String getWorkOut()
    {
        return myCoach.getDailyWorkout();
    }


}
