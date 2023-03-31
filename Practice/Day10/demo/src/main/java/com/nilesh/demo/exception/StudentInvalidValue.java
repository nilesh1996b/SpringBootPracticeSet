package com.nilesh.demo.exception;

public class StudentInvalidValue extends RuntimeException {

    public StudentInvalidValue(String message) {
        super(message);
    }

    public StudentInvalidValue(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentInvalidValue(Throwable cause) {
        super(cause);
    }
}
