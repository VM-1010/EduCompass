package com.educompass.resource;

import java.time.LocalDate;

public abstract class Resource {
    LocalDate dateadded;
    Subject subject;
    Semester semester;

    abstract void open();
    abstract String getDateAdded();
}
