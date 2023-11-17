package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class RegistrationController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void registerButtonClicked(ActionEvent event) {
        // Implement your registration logic here
        // You can store the new username and password in your data storage
        // For simplicity, let's just open the main quiz page for now
        openQuizPage(event);
    }

    @FXML
    private void openLogin(ActionEvent event) {
        try {
            Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisStage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void openQuizPage(ActionEvent event) {
        try {
            Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisStage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Quiz.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(javafx.scene.paint.Color.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}