package com.educompass.exception;

import java.sql.SQLException;

public class IDMismatchException extends SQLException {
    public IDMismatchException(int id) {
        super("Tried to access non-existent id : " + id);
    }
    public IDMismatchException() {
        super("Tried to access non-existent id");
    }
}
