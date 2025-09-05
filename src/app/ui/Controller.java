package app.ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	
	@FXML
	private void loginuser(ActionEvent event) throws Exception {
		Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
		// this fetches the primary stage
		stage.setScene(SceneSwitcher.getScene(Scenetype.UserWelcome));
		
	}
	
	@FXML
	private void loginadmin(ActionEvent event) throws Exception {
		Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
		stage.setScene(SceneSwitcher.getScene(Scenetype.AdminWelcome));
		
	}

	@FXML
	private void returntologin(ActionEvent event) throws Exception {
		Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
		stage.setScene(SceneSwitcher.getScene(Scenetype.LoginScreen));
	}
}

class SceneSwitcher {
	static Scene getScene(Scenetype s) throws IOException  {
		Parent parent = FXMLLoader.load(SceneSwitcher.class.getResource(s.getFxml()));
		return new Scene(parent);
		
	}
}

enum Scenetype {
	UserWelcome("/resources/userloggedin.fxml"),
	AdminWelcome("/resources/adminloggedin.fxml"),
	LoginScreen("/resources/menulayout.fxml");
	private final String fxmlLocation;
	Scenetype(String _location) {
		this.fxmlLocation = _location;
	}
	String getFxml() {
		System.out.println(this.fxmlLocation);
		return this.fxmlLocation;
	}
}

