package com.educompass.exception;

import java.sql.SQLException;

public class InvalidResourceException extends SQLException {
    public InvalidResourceException() {
        super("Tried to insert an invalid row into table");
    }
}
