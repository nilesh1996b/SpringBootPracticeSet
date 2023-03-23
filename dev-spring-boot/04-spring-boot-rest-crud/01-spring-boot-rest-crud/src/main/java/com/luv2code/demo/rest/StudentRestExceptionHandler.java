package com.luv2code.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {

//    add exception handling code here

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException studentNotFoundException)
    {
        // Create a StudentErrorResponse

        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(studentNotFoundException.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // Return response entity


        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //Add another exception Handler ... to catch any exception (catch all)

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleException(Exception exception)
    {
        StudentErrorResponse error = new StudentErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exception.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        // Return response entity


        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
