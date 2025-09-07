package app.ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Control {
	// method to change the scene
		public static void changeScene(ActionEvent event, Scenetype s) throws IOException {
			Stage stage = (Stage) ((javafx.scene.Node)event.getSource()).getScene().getWindow();
			stage.setScene(getScene(s));
		}
		
		private static Scene getScene(Scenetype s) throws IOException  {
			return new Scene(FXMLLoader.load(s.getClass().getResource(s.getFxml())));
		}
}
