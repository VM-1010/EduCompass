package com.educompass.gui;

import java.util.*;

import com.educompass.gui.controller.CardController;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

record CardData(String title, String type) {}

class DummyService {
        private ArrayList<String> names;
        private ArrayList<String> types;

        DummyService() {
            names = new ArrayList<>();
            names.addAll(List.of("Data structures", "Theory of Computation", "Statistics", "Digital Logic", "OOP in Java"));
            types = new ArrayList<>();
            types.addAll(List.of("ytvideo", "ytplaylist", "gitrepo", "tutorial", "nptel", "book"));
        }

        List<CardData> getFive(int n) {
            List<CardData> l = new ArrayList<>();
            for (int i = (n-1)*5 ; i < n*5 ; i ++) {
                l.add(new CardData(this.names.get(i),this.types.get(i)));
            }
            return l;
        }

}

public class Test {
     void loadTestCards(Stage s) {
        
        VBox p = new VBox();
        p.setAlignment(Pos.TOP_CENTER);
        p.setPadding(new Insets(30,0,0,0));
        p.setSpacing(20);
        Scene sc = new Scene(p);
        s.setScene(sc);
        p.getChildren().add(new Text("This is currently not functional yet!!"));
        DummyService d = new DummyService();
        for (CardData c : d.getFive(1)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/resourcecard.fxml"));
                p.getChildren().add(loader.load());
                CardController cc = loader.getController();
                cc.setTitle(c.title());
                cc.setType(c.type());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
