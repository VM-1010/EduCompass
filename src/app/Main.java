
package app;
import app.ui.MainWindowforUser;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	final int defaultwidth = 800;
	final int defaultheight = 600;
	final String apptitle = "EduCompass";
	final Image appicon = new Image("edu.png");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Parameters cmdparams = getParameters();
		// System.out.println(cmdparams.getRaw());
		boolean isAdmin = cmdparams.getRaw().contains("--admin-login");
		
		// Scene scene = !isAdmin ? MainWindowforUser.getScene() : null; 
		
	}
	
	public static void main(String[] args) {
		launch();
	}

	

}