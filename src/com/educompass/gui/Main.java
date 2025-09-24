package com.educompass.gui;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.logging.Logger;

import com.educompass.gui.controller.CardController;

public class Main extends javafx.application.Application {  
    private final int appheight = 600;
    private final int appwidth = 800;

    // TODO need to be final and have point to image
    private Image appicon; 
    
    private final String apptitle = "Educompass - Development build";

    public static void main(String[] args) {
        // launches the app, with arguments and also runs the start() fn 
        launch(args);
    }

    
     
    /**
     * Overriding start() from {@link javafx.application.Application}
     */
    @Override public void start(Stage s) throws Exception {
        init(s);
        new Test().loadTestCards(s);
        
    }

    /**
     * Initializes with default values required for the primarystage
     * @param s
     */

    private void init(Stage s) { 
        s.setTitle(apptitle);
        // s.getIcons().add(appicon);
        s.setResizable(false);
        s.setWidth(1600);
        s.setHeight(900);
        s.setMinWidth(appwidth);
        IO.println("Started window with the dimensions : " + s.getWidth() +  "x" + s.getHeight());
        s.setMinHeight(appheight);
        s.show();
    }

    
    
}
