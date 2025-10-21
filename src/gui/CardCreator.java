
package gui;

import controllers.CardController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import model.Resource;

public class CardCreator {

    public Parent make(Resource r) {
        try {
            FXMLLoader l = new FXMLLoader((getClass().getResource("../resources/card.fxml")));
            Parent p = l.load();
            ((CardController)l.getController()).setTexts(r.getTitle(), r.getType(), r.getId());
            return p;
        } catch(Exception e) {
            IO.println(e.getMessage());
        }
        return null;
    }
}
