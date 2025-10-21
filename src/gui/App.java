package gui;
import java.awt.Paint;
import java.util.ArrayList;

import dao.MainDao;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application{
    static Stage s;
    CardCreator cc;
    int count = 0;
    public static void main(String[] args) throws Exception {
        IO.println("Hello, World!");
        try {
        launch();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static Stage getPrimaryStage() {
        return s;
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        MainDao d = new MainDao();
        for (model.Resource r : d.fetchAll()) {
           //  IO.println(r);
        }
        
        s = new Stage();
        
        //Parent p = new FXMLLoader(getClass().getResource("resources/adminscreen.fxml")).load();
        Parent p = new FXMLLoader(getClass().getResource("../resources/mainmenu.fxml")).load();
        Scene sc = new Scene(p);
        s.setTitle("TEST APP");
        s.setMinWidth(1280);
        s.setMinHeight(720);
        s.setResizable(false);
        s.setScene(sc);
        s.show();
    }
}
