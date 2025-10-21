
package gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class CardCreator {



    public Parent make() {
        try {
            Parent p = new FXMLLoader((getClass().getResource("resources/card.fxml"))).load();
            
            return p;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
