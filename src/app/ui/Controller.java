package app.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private void handleClick(ActionEvent event) throws Exception {
		Parent userloggedin = FXMLLoader.load(getClass().getResource("/resources/userloggedin.fxml"));
		Scene userlogin = new Scene(userloggedin);
		Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
		stage.setScene(userlogin);
		
	}
}
