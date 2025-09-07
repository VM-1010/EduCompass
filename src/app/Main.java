
package app;
import app.ui.MainWindowforUser;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.text.Font;


public class Main extends Application {
	final int defaultwidth = 800;
	final int defaultheight = 600;
	final String apptitle = "EduCompass";
	final Image appicon = new Image("resources/edu.png");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle(apptitle);
		stage.setResizable(true);
		stage.setMinWidth(800);
		stage.setMinHeight(600);
		stage.getIcons().add(appicon);
		
		Parent root =FXMLLoader.load(getClass().getResource("/resources/menulayout.fxml")); //loader.load();
		Scene scene = new Scene(root);
		
		Font.loadFont(getClass().getResource("/resources/fonts/Ubuntu-Regular.ttf").toExternalForm(), 20);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

	

}