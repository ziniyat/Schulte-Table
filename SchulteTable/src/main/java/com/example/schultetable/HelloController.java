package com.example.schultetable;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML private Button mode4x4;
    @FXML private Button mode5x5;
    @FXML private Button mode6x6;

    @FXML
    protected void onMode4x4() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("4x4.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) mode4x4.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    protected void onMode5x5() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("5x5.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) mode5x5.getScene().getWindow();
        stage.setScene(scene);
    }


    @FXML
    protected void onMode6x6() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("6x6.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) mode6x6.getScene().getWindow();
        stage.setScene(scene);
    }

}
