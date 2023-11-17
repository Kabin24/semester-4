package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void loginButtonClicked(ActionEvent event) {
        // Implement your login logic here
        // You can check the username and password against your stored data
        // For simplicity, let's just open the main quiz page for now
        openQuizPage(event);
    }

    @FXML
    private void openRegistration(ActionEvent event) {
        try {
            Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisStage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Registration.fxml"));
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