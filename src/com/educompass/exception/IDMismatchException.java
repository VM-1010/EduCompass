package com.educompass.exception;


public class IDMismatchException extends RuntimeException {
    public IDMismatchException(int id) {
        super("Tried to access non-existent id : " + id);
    }
    public IDMismatchException() {
        super("Tried to access non-existent id");
    }
}
