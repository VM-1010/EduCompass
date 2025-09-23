package com.educompass.exception;

public class DBServiceException extends RuntimeException {
    public DBServiceException(String action) {
        super("Encountered an issue while service was performing the action: " + action);
    }
    public DBServiceException() {
        super("There was an issue connecting to the database. ");
    }
}
