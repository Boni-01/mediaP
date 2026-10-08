module com.media {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;

    opens com.media to javafx.fxml;
    exports com.media;
}