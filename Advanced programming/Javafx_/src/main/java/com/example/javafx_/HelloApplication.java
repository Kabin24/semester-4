package com.example.javafx_;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


import java.io.IOException;
// creating  login form using java fx
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
              // creating label email
        Text lbl1=new Text("Email");


        //creating label password
        Text lbl2=new Text("Password");

        // creating Text field for email
        TextField text1= new TextField();


        // creating Text field for password
        PasswordField text2 =new PasswordField();

        //creating buttons
        Button button1=new Button("Sign In");
        Button button2=new Button("Submit");

        //creating a   grid pane
        GridPane gridPane = new GridPane();


        // setting the size for pane
        gridPane.setMinSize(400,200);

        // seeting the padding
        gridPane.setPadding(new Insets(10,10,10,10));

        //setting the vertical and horizontal gaps between the colums
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //setting the grid aligment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging alll tje needs in grid
        gridPane.add(lbl1,0,0);
        gridPane.add(text1,1,0);
        gridPane.add(lbl2,0,1);
        gridPane.add(text2,1,1);
        gridPane.add(button1,1,3);
        gridPane.add(button2,1,2);

         // styling
        button1.setStyle("-fx-background-color: red; -fx-text-fill:white;");
        button2.setStyle("-fx-background-color: red; -fx-text-fill:white;");

        //creating a scene object
        Scene  scene =new Scene(gridPane);


        //setting title to the stage
        stage.setTitle("Login page");

        //adding scene ti the stage
        stage.setScene(scene);

        //display the contents
        stage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}
