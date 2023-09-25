module com.example.loancalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.loancalculator to javafx.fxml;
    exports com.example.loancalculator;
}