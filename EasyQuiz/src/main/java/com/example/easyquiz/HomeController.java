package com.example.easyquiz;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button playquizbtn;

    @FXML
    private void initialize() {

        playquizbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Check if the user is already logged in
                if (isLoggedIn()) {
                    openQuizPage(event);
                } else {
                    openLoginPage(event);
                }
            }
        });
    }

    private boolean isLoggedIn() {
        // Implement your logic to check if the user is logged in
        // For now, let's assume the user is not logged in
        return false;
    }

    private void openLoginPage(ActionEvent event) {
        try {
            Stage thisStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            thisStage.close();

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.initStyle(StageStyle.TRANSPARENT);
            scene.setFill(Color.TRANSPARENT);
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
            scene.setFill(Color.TRANSPARENT);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}