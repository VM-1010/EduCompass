package app.ui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import app.ui.Control;

public class Controller {
	
	//change here
	
	@FXML // when user tries to "login as user"
	private void loginuser(ActionEvent event) throws Exception {
		Control.changeScene(event, Scenetype.UserWelcome);
	}
	
	@FXML // when user tries to "login as admin"
	private void loginadmin(ActionEvent event) throws Exception {
		Control.changeScene(event, Scenetype.AdminWelcome);
	}

	@FXML // when user tries to "return to login" from either of welcome screens
	private void returntologin(ActionEvent event) throws Exception {
		Control.changeScene(event, Scenetype.LoginScreen);
	}
}



