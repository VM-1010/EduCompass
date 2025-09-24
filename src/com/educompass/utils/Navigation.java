package com.educompass.utils;

import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.IOException;

import javax.management.RuntimeErrorException;

import javafx.event.ActionEvent;

public class Navigation {
    public static void navigate(ActionEvent event, String link) throws RuntimeException{
        try {
            URI uri = new URI(link);
            if (Desktop.isDesktopSupported()) {
                if (Desktop.getDesktop().isSupported(Action.BROWSE)) {
                    Desktop.getDesktop().browse(uri);
                } else {
                    IO.println("Cannot browse on this platform");
                }
            } else {
                IO.println("Desktop is not supported on this platform");
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException( "Invalid link! : "+ link);
        } catch (IOException e) {
            throw new RuntimeException("Cannot browse!");
        }

    }
}   
