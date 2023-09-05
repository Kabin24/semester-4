module com.example.javafx_ {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafx_ to javafx.fxml;
    exports com.example.javafx_;
}