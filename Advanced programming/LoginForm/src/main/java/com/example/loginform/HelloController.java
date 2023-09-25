package com.example.loginform;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onClickSignup() throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Registration.fxml"));
        Object root = fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Registration");
        stage.setScene(new Scene((Parent) root ,620,640));
        stage.show();
    }

}