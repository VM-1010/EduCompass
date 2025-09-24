package com.educompass.gui.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class CardController {
    @FXML private HBox meta;
    @FXML private Text title;
    @FXML private Image icon;
    @FXML private Text type;
    @FXML private BorderPane root;  
    @FXML private Button btn;

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setType(String type) {
        this.type.setText(type);
    }

    @FXML private void onClick(ActionEvent e) throws RuntimeException {
        IO.println("Button clicked");
    }
}
