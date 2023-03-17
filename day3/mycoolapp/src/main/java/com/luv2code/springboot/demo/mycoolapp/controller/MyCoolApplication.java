package com.luv2code.springboot.demo.mycoolapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCoolApplication {

    @GetMapping("/")
    public String homePage()
    {
        return "I will show you what I can do";
    }

    @GetMapping("/second")
    public String secondHomePage()
    {
        return "lets see what you can do";
    }

    @GetMapping("/second/third")
    public String thirdHomePage()
    {
        return "You can not do anything";
    }

}
