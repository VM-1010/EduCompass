package com.educompass.gui.controller;

import com.educompass.utils.Navigation;

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
    @FXML private Text resource_id;

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public void setType(String type) {
        this.type.setText(type);
    }

    public void setId(int id) {
        this.resource_id.setText(Integer.toString(id)+". ");
    }

    public void setId(String id) {
        this.resource_id.setText(id);
    }

    public void setTarget(String link) {
        this.btn.setOnAction((e) -> {
            Navigation.navigate(e, link);
        });
    }

    @FXML private void onClick(ActionEvent e) throws RuntimeException {
        IO.println("Button for %s clicked".formatted(this.title.getText()));
    }
}
