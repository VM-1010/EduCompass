package controllers;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LoginController extends AnchorPane {
    @FXML private Button userbtn;
    @FXML private Button adminbtn;


    @FXML void whenAdminBtnClicked(ActionEvent e) throws Exception {
        Stage s = gui.App.getPrimaryStage();
        s.getScene().setRoot(new FXMLLoader(getClass().getResource("../resources/adminscreen.fxml")).load());
    }

    @FXML void whenUsrBtnPressed(ActionEvent e) throws Exception {
        gui.App.getPrimaryStage().getScene().setRoot(new FXMLLoader(getClass().getResource("../resources/userscreen.fxml")).load());
    }
}
