
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


public class Main extends Application {
	final int defaultwidth = 800;
	final int defaultheight = 600;
	final String apptitle = "EduCompass";
	final Image appicon = new Image("resources/edu.png");
	
	
	@Override
	public void start(Stage stage) throws Exception {
		Parameters cmdparams = getParameters();
		//stage.setMinHeight(600);
		//stage.setMinWidth(800);
		stage.setTitle(apptitle);
		stage.setResizable(false);
		stage.getIcons().add(appicon);
		// System.out.println(cmdparams.getRaw());
		boolean isAdmin = cmdparams.getRaw().contains("--admin-login");
		MainWindowforUser m = new MainWindowforUser();
		//FXMLLoader loader = new FXMLLoader(getClass().getResource("resources/menulayout.fxml"));
		Parent root =FXMLLoader.load(getClass().getResource("/resources/menulayout.fxml")); //loader.load();
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		launch();
	}

	

}