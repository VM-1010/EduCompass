module educompass {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires javafx.graphics;
    opens educompass to javafx.fxml;
    opens educompass.controllers to javafx.fxml;
    exports educompass.controllers;
    exports educompass;
}