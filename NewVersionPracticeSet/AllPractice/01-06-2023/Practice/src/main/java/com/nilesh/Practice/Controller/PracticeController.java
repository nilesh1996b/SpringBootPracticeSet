package com.nilesh.Practice.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @GetMapping("/")
    String helloWorld()
    {
        return "Hello My Friend";
    }

    @GetMapping("/name")
    String myName()
    {
        return "My Name is Nilesh";
    }

}
