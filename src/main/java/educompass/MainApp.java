package educompass;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.text.Font;

import java.io.IOException;


public class MainApp extends Application {
    private static Stage stage;
    private Image icon = new Image(getClass().getResourceAsStream("/graphics/edu.png"));
    private String appname = "Educompass - Development build";
    private Font mainfont = Font.loadFont(getClass().getResource("/fonts/adwaita.ttf").toExternalForm(), 20);
    @Override
    public void start(@SuppressWarnings("exports")Stage s) throws IOException {
        stage = s;
        stage.setWidth(1280);
        stage.setHeight(720);
        stage.setResizable(false);
        stage.getIcons().add(this.icon);
        setRoot("primary",appname);
    }

    static void setRoot(String fxml) throws IOException {
        setRoot(fxml,stage.getTitle());
    }

    static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }


    public static void main(String[] args) {
        launch(args);
    }



}

