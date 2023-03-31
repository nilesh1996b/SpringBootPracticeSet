package com.nilesh.test.rest;

import com.nilesh.test.entity.Student;
import com.nilesh.test.exception.StudentErrorResponse;
import com.nilesh.test.exception.StudentInvalidValueException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class RestTestController {

    private List<Student> studentList;

    @PostConstruct
    public void createList()
    {
        studentList = new ArrayList<>();
        studentList.add(new Student("Nilesh","Bind"));
        studentList.add(new Student("Rajesh","Bind"));
        studentList.add(new Student("Nilesh","Nishad"));
    }

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello";
    }
    @GetMapping("/students")
    public List<Student> getStudents()
    {
        return studentList;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId)
    {
        if((studentId>=studentList.size()) || (studentId<0))
        {
            throw new StudentInvalidValueException("Student not found by Student id : " + studentId);
        }
        return studentList.get(studentId);
    }

}
