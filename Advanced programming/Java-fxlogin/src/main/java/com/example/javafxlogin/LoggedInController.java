package com.example.javafxlogin;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LoggedInController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}