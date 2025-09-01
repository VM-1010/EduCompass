package com.educompass.resource;

import java.time.LocalDate;

import java.net.URI;
import java.net.URL;
import java.awt.Desktop;

public class YoutubeLinkResource extends Resource {
    URI VideoLink;
    public YoutubeLinkResource(Subject s, String url, Semester sem) {
        super.subject = s;
        super.semester = sem;
        super.dateadded = LocalDate.now();
        try {
            this.VideoLink = new URL(url).toURI();
        } catch (Exception e) { // need specific exceptions
            throw new RuntimeException(e);
        }
    }

    public String getUrl() {
        return VideoLink.toString();
    }

    public void open() {
        //Desktop d = Desktop.getDesktop();
        try {
            if (Desktop.getDesktop().isSupported(Desktop.Action.BROWSE))
                Desktop.getDesktop().browse(VideoLink);
            else // if desktop doesn't support the BROWSE Action (linux/mac), then xdg-open is used, usually browse is supported on windows
                Runtime.getRuntime().exec(new String[]{"xdg-open", this.getUrl()}); 
        } 
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getDateAdded() {
        return dateadded.toString();
    }
}
