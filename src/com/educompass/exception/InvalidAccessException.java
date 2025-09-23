package com.educompass.exception;

import java.sql.SQLException;

public class InvalidAccessException extends SQLException {
    public InvalidAccessException() {
        super("Tried to access an invalid field");
    }
    public InvalidAccessException(String col) {
        super("Tried to access an invalid field : " + col);
    }
}
