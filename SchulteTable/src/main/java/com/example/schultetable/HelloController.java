package com.example.schultetable;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class HelloController {

    @FXML private Button mode4x4;
    @FXML private Button mode5x5;
    @FXML private Button mode6x6;

    protected String[] buttons;

    final protected String[] nums = {
            "1",   "2",  "3",  "4",  "5",  "6",  "7",  "8",  "9", "10",
            "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
            "31", "32", "33", "34", "35", "36"
    };


    @FXML
    protected void onMode4x4() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("4x4.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) mode4x4.getScene().getWindow();
        stage.setScene(scene);

        buttons = new String[16];
        for

        long startTime = System.currentTimeMillis();
// блок кода, время выполнения которого нужно измерить
        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;
    }

    protected String[] buttonsInit(int length) {
        buttons = new String[length];


    }

    protected static void mixStrings(String[] strings) {
        Random rnd = new Random();

        for(int i = 0; i < strings.length; i++) {
            int index = rnd.nextInt(i + 1);
            String temp = strings[index];
            strings[index] = strings[i];
            strings[i] = temp;
        }
    }

    protected String[] newRandNums(int length) {
        if (length > 36)
            return 0;
        String[] randNums = new String[nums.length];

        for (int i = 0; i < randNums.length; i++) {
            randNums[i] = nums[new Random().nextInt(nums.length)];
        }
        mixStrings(randNums);
        return randNums;
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
