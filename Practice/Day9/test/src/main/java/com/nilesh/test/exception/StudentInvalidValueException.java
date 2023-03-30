package com.nilesh.test.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class StudentInvalidValueException extends RuntimeException{

    public StudentInvalidValueException(String message) {
        super(message);
    }

    public StudentInvalidValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentInvalidValueException(Throwable cause) {
        super(cause);
    }
}
