package controllers;

import javafx.scene.control.Button;
import javafx.event.*;

import javafx.fxml.*;

public class AdminController {
    @FXML private Button backbtn;

    @FXML private void whenBackBtnPressed(ActionEvent e) throws Exception{
        gui.App.getPrimaryStage().getScene().setRoot(new FXMLLoader(getClass().getResource("../resources/mainmenu.fxml")).load());
    }
}
