package app.resource;
import app.exception.*;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;

public class PdfResource extends Resource {
    URI pdfLink;

    public PdfResource(Subject s, String url, Semester sem){
        super.subject = s;
        super.dateadded = LocalDate.now();
        super.semester = sem;

        try {
            this.pdfLink = new URL(url).toURI();
        } catch (Exception e) {
            throw new BadResourceException(e);
        }
    } 

    public void open() {
        // TODO
    }

    public String getDateAdded() {
        return dateadded.toString();
    }

}
