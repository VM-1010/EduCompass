
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
            CardController cc = (CardController)l.getController();
            cc.setTexts(r.getTitle(), r.getType(), r.getId());
            cc.setFollowDestination(r.getUrl());
            return p;
        } catch(Exception e) {
            IO.println(e.getMessage());
        }
        return null;
    }
}
