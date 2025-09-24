package com.educompass.gui;

import java.util.*;

import com.educompass.gui.controller.CardController;
import com.educompass.model.Resource;
import com.educompass.service.ResourceService;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
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
        ScrollPane sp = new ScrollPane(p);
        HBox h = new HBox(sp);
        h.setAlignment(Pos.TOP_CENTER);
        // sp.setCenterShape(true);
        p.setAlignment(Pos.TOP_CENTER);
        p.setPadding(new Insets(30,0,0,0));
        p.setSpacing(20);
        sp.setVbarPolicy(ScrollBarPolicy.NEVER);
        Scene sc = new Scene(h);
        s.setScene(sc);
        Text t = new Text("demo for scrolling view of resoruce cards");
        t.setFont(Font.font(20));
        p.getChildren().add(t);

        DummyService d = new DummyService();
         int i = 0;
        ResourceService rs = new ResourceService();
        for (Resource r : rs.fetchAllResources()) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/resourcecard.fxml"));
            
            try {
                p.getChildren().add(loader.load());
            } catch (Exception e) {
                IO.println("unable to fetch children");
            }
            CardController cc = loader.getController();
            try {
                cc.setTitle(r.getTitle());
                cc.setType(r.getType().toString());
                cc.setId(r.getId());
                cc.setTarget(r.getResource_link().getLink());
                i ++;
            } catch (Exception e) {
                cc.setTitle("Unkknown Resource");
                cc.setType("unknown");
                cc.setId("???");
            }
        }
        IO.println(i);

    }
}
