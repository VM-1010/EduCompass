package controllers;

import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class CardController {
    @FXML private Text title, type, id;

    public void setTexts(String title, String type, int id) {
        this.title.setText(title);
        this.type.setText(type);
        this.id.setText("#"+Integer.toString(id));
        // this.course.setText(crs);

    }
}
