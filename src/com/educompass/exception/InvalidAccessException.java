package com.educompass.exception;


public class InvalidAccessException extends RuntimeException{
    public InvalidAccessException() {
        super("Tried to access an invalid field");
    }
    public InvalidAccessException(String col) {
        super("Tried to access an invalid field : " + col);
    }
}
