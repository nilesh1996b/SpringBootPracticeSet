package com.nilesh.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.function.EntityResponse;

import java.net.http.HttpRequest;

@ControllerAdvice
public class StudentException {

    @ExceptionHandler
    public ResponseEntity<StudentExceptionError> exceptionHandler(StudentInvalidValue exp)
    {
        StudentExceptionError error = new StudentExceptionError();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exp.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<StudentExceptionError> exceptionHandler(Exception exp)
    {
        StudentExceptionError error = new StudentExceptionError();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exp.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);

    }

}
