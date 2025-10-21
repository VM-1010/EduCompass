package controllers;
import javafx.scene.control.Accordion;
//  for both admin and user views
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.TitledPane;
import model.*;


import java.util.*;

import dao.MainDao;
import gui.CardCreator;
import javafx.event.*;

import javafx.fxml.*;

public class AdminController {
    @FXML private Button backbtn, ubackbtn;
    @FXML private Accordion accord;

    @FXML private void whenBackBtnPressed(ActionEvent e) {
        try {
        gui.App.getPrimaryStage().getScene().setRoot(new FXMLLoader(getClass().getResource("../resources/mainmenu.fxml")).load());
        }catch (Exception ex) {
            IO.println("Canont load mainmenu");
        }
    }

    public void loadcards() throws RuntimeException {
        List<TitledPane> l = accord.getPanes();
        CardCreator cc = new CardCreator();
        for (Resource r: new MainDao().fetchAll()) {
            VBox v = ((VBox)((ScrollPane) l.get(r.getSemester()-1).getContent()).getContent());
            
            if (v.getChildren() != null) v.getChildren().add(cc.make(r)); 
        }
    }

    @FXML
    public void initialize() {
        try {
            loadcards();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
