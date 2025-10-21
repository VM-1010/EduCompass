package controllers;
import java.awt.Desktop;
import java.net.URI;

import java.net.URI;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class CardController {
    @FXML private Text title, type, id;

    @FXML private Button follow;

    public void setTexts(String title, String type, int id) {
        this.title.setText(title);
        this.type.setText(type);
        this.id.setText("#"+Integer.toString(id));
        // this.course.setText(crs);
    }

    public void setFollowDestination(String url) {
        follow.setOnAction((event) -> {
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
