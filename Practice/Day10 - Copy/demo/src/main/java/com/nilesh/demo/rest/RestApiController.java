package com.nilesh.demo.rest;

import com.nilesh.demo.entity.Student;
import com.nilesh.demo.exception.StudentInvalidValue;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class RestApiController {

    private List<Student> studentList;

    @PostConstruct
    public void addData()
    {
        studentList = new ArrayList<>();

        studentList.add(new Student("Nilesh","Bind"));
        studentList.add(new Student("Nilesh","Panday"));
        studentList.add(new Student("Rajesh","Bind"));
        studentList.add(new Student("Rajesh","Panday"));

    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId)
    {
        if((studentId>=studentList.size()) || (studentId<0))
        {
            throw new StudentInvalidValue("There is no student with student ID " + studentId);
        }

        return studentList.get(studentId);
    }


}
