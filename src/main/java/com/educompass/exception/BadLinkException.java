package com.educompass.exception;

// when a link to a resource is not proper URI
public class BadLinkException extends RuntimeException {
    public BadLinkException(Exception e) {
        super(e);
    } 
}
