module com.example.javafxlogin {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.javafxlogin to javafx.fxml;
    exports com.example.javafxlogin;
}