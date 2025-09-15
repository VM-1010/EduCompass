package app.resource;

import java.time.LocalDate;

public abstract class Resource {
    LocalDate dateadded;
    Subject subject;
    
   
    abstract void open();
    abstract String getDateAdded();
}
