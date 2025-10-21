package controllers;
import javafx.scene.control.Accordion;
//  for both admin and user views
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
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


    @FXML TextField title, type, semester, url;
    @FXML private Button submit;

    @FXML TextField title_update, type_update, semester_update, url_update, id_update, id_delete;
    @FXML private Button update, delete;

    @FXML private void whenBackBtnPressed(ActionEvent e) {
        try {
        gui.App.getPrimaryStage().getScene().setRoot(new FXMLLoader(getClass().getResource("../resources/mainmenu.fxml")).load());
        }catch (Exception ex) {
            IO.println("Canont load mainmenu");
        }
    }


    @FXML private void onUpdateSubmit(ActionEvent e) {
        // assert no empty inputs
        if (!(title_update.getText() != "" && type_update.getText() != "" && semester_update.getText() != "" && url_update.getText() != "" && id_update.getText() != null)) return;
        
        int sem, id;
        try {
            sem = Integer.parseInt(semester_update.getText());
            id = Integer.parseInt(id_update.getText());
        } catch (NumberFormatException ne) {     
            update.setStyle("-fx-text-fill: red;");
            IO.println("Bad semeseter input");
            return;
        }

        boolean inserted = new MainDao().update(new Resource(id, sem, title_update.getText(),type_update.getText(), url_update.getText()));
        

        if (!inserted) {
            update  .setStyle("-fx-text-fill: red;");
            IO.println("Bad input for updation : " + id);
        } else {
            update.setStyle("-fx-text-fill: green;");
            IO.println("Successfully updated");
        }

        
    }


    @FXML private void onAddSubmit(ActionEvent e) {
        if (!(title.getText() != "" && type.getText() != "" && semester.getText() != "" && url.getText() != "")) return; 
        int sem;
        try {
            sem = Integer.parseInt(semester.getText());
        } catch (NumberFormatException ne) {     
            submit.setStyle("-fx-text-fill: red;");
            IO.println("Bad semeseter input");
            return;
        }

        boolean inserted = new MainDao().insert(new Resource(sem, title.getText(), type.getText(), url.getText()));

        if (!inserted) {
            submit.setStyle("-fx-text-fill: red;");
            IO.println("Bad input");
        } else {
            submit.setStyle("-fx-text-fill: green;");
            IO.println("Non empty input");
        }

    }

    @FXML private void onDeleteSubmit(ActionEvent event) {
        
        try {
            if (id_delete!=null) {
                int id = Integer.parseInt(id_delete.getText());
                boolean deleted = new MainDao().delete(id);
                if (!deleted) {
                    throw new Exception();
                } else {
                    submit.setStyle("-fx-text-fill: green;");
                    IO.println("Non empty input");
                }
            }
        } catch (Exception e) {
            submit.setStyle("-fx-text-fill: red;");
            IO.println("Bad input");
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
            if (accord != null)
            loadcards();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

}
