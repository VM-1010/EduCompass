package educompass.controllers;

import java.io.IOException;

import javafx.animation.TranslateTransition;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

public class MainController {

    // FXMLLoader loader = new FXMLLoader();

    @FXML
    private VBox sidebar;

    @FXML
    private AnchorPane content;

    @FXML void toSem() throws IOException {
        Parent Sem = getRoot(Tabs.BrowseBySemester);
        replaceContent(Sem);
       //  content.setCenter(Sem);
    }

    @FXML void toSearch() throws IOException {
        Parent Search = getRoot(Tabs.Search);
        replaceContent(Search);;
    }

    @FXML void toManage () {}
    @FXML void toPref () {}


    @FXML void close() {
        Platform.exit();
    }

    Parent getRoot(Tabs t) throws IOException {
        System.out.println("Switched to " + t.getFxml());
        return FXMLLoader.load(getClass().getResource(t.getFxml()));
    }

    private void replaceContent(Parent p) {
        TranslateTransition s2 = new TranslateTransition(Duration.millis(300), p);
         content.getChildren().clear();
        p.setTranslateX(content.getWidth());
        content.getChildren().add(p);
        s2.setFromX(content.getWidth());
        s2.setToX(0);
        s2.play();
    }


    @FXML
    private void initialize() throws Exception{
      // content.getChildren().addAll(getRoot(Tabs.BrowseBySemester));
    }
}

enum Tabs {
    
    BrowseBySemester("/fxml/Sem.fxml"),
    BrowseByCourse("/fxml/Course.fxml"),
    Search("/fxml/Search.fxml"),
    MyList("/fxml/List.fxml"),
    Prefs("/fxml/Pref.fxml");

    private final String s;

    private Tabs(String s) {
        this.s = s;
    }

    public String getFxml() {
        return this.s;
    }
}