module es.rhidalgo {
    requires javafx.controls;
    requires javafx.fxml;

    opens es.rhidalgo to javafx.fxml;
    exports es.rhidalgo;
}
