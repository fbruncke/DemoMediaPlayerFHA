module com.example.demomediaplayerfha {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;

    opens com.example.demomediaplayerfha to javafx.fxml;
    exports com.example.demomediaplayerfha;
}