package com.example.frnicky_spring_test.exception;

public class TaskAlreadyExistsException extends Exception {
    public TaskAlreadyExistsException (String message, Throwable error) {
        super(message, error);
    }
}
