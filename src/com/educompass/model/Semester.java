package com.educompass.model;

public enum Semester {
    S1("S1"),
    S2("S2"),
    S3("S3"),
    S4("S4"),
    S5("S5"),
    S6("S6"),
    S7("S7"),
    S8("S8");

    private final String sem;

    private Semester(String sem) {
        this.sem = sem;
    }

    @Override public String toString() {
        return this.sem;
    }
}
