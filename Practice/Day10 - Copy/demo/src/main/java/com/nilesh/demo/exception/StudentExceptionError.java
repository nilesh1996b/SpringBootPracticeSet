package com.nilesh.demo.exception;

public class StudentExceptionError {
    private int status;
    private String message;
    private long timeStamp;

    public StudentExceptionError() {
    }

    public StudentExceptionError(int status, String message, long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int setStatus) {
        this.status = setStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "StudentExceptionError{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
