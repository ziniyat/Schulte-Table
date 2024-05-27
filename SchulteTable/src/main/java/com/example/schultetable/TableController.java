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

public class TableController {

    @FXML
    private Button start;
    @FXML
    private Button end;
    @FXML
    private Button menu;

    @FXML
    private Button result;
    @FXML
    private Label timeResult;
    @FXML
    private Label levelResult;

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b8;
    @FXML
    private Button b9;
    @FXML
    private Button b10;
    @FXML
    private Button b11;
    @FXML
    private Button b12;
    @FXML
    private Button b13;
    @FXML
    private Button b14;
    @FXML
    private Button b15;
    @FXML
    private Button b16;
    @FXML
    private Button b17;
    @FXML
    private Button b18;
    @FXML
    private Button b19;
    @FXML
    private Button b20;
    @FXML
    private Button b21;
    @FXML
    private Button b22;
    @FXML
    private Button b23;
    @FXML
    private Button b24;
    @FXML
    private Button b25;
    @FXML
    private Button b26;
    @FXML
    private Button b27;
    @FXML
    private Button b28;
    @FXML
    private Button b29;
    @FXML
    private Button b30;
    @FXML
    private Button b31;
    @FXML
    private Button b32;
    @FXML
    private Button b33;
    @FXML
    private Button b34;
    @FXML
    private Button b35;
    @FXML
    private Button b36;


    protected int buttonsAmount = 0;
    protected int tblLevel = 0;
    protected long startTime = 0;
    protected long endTime = 0;

    final protected int[] nums = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
            21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
            31, 32, 33, 34, 35, 36
    };

    protected int[] newRandNums(int length) {
        int[] randNums = {};
        if (length > nums.length)
            return randNums;

        randNums = new int[length];

        System.arraycopy(nums, 0, randNums, 0, randNums.length);
        mixNums(randNums);
        return randNums;
    }

    protected static void mixNums(int[] arr) {
        Random rnd = new Random();

        for (int i = 0; i < arr.length; i++) {
            int index = rnd.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }


    @FXML
    protected void onStart4x4() {
        if (tblLevel == 0) initTable(4);
    }

    @FXML
    protected void onStart5x5() {
        if (tblLevel == 0) initTable(5);
    }

    @FXML
    protected void onStart6x6() {
        if (tblLevel == 0) initTable(6);
    }


    protected void initTable(int level) {
        tblLevel = level;
        buttonsAmount = tblLevel * tblLevel;

        Button[] buttons = new Button[]{
                b1, b2, b3, b4, b5, b6, b7, b8, b9,
                b10, b11, b12, b13, b14, b15, b16, b17, b18,
                b19, b20, b21, b22, b23, b24, b25, b26, b27,
                b28, b29, b30, b31, b32, b33, b34, b35, b36
        };

        int[] buttonNums = newRandNums(buttonsAmount);

        for (int i = 0; i < buttonNums.length; i++) {
            buttons[i].setText(Integer.toString(buttonNums[i]));
        }
        startTime = System.currentTimeMillis();
    }

    @FXML
    protected void onEnd() throws IOException {
        if (buttonsAmount == 0 && endTime == 0) {
            endTime = System.currentTimeMillis();
            long timeElapsed = endTime - startTime;

            timeResult.setText("Elapsed time: " + timeElapsed / 1000 + "s");
            levelResult.setText("Level: " + tblLevel + "x" + tblLevel);
        }
    }

    protected void buttonHandler(Button button) {
        if (button.getText().equals(Integer.toString(buttonsAmount))) {
            button.setVisible(false);
            buttonsAmount -= 1;
        }
    }

    @FXML
    protected void onMenu() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        Stage stage = (Stage) menu.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    protected void b1Clicked() {
        buttonHandler(b1);
    }

    @FXML
    protected void b2Clicked() {
        buttonHandler(b2);
    }

    @FXML
    protected void b3Clicked() {
        buttonHandler(b3);
    }

    @FXML
    protected void b4Clicked() {
        buttonHandler(b4);
    }

    @FXML
    protected void b5Clicked() {
        buttonHandler(b5);
    }

    @FXML
    protected void b6Clicked() {
        buttonHandler(b6);
    }

    @FXML
    protected void b7Clicked() {
        buttonHandler(b7);
    }

    @FXML
    protected void b8Clicked() {
        buttonHandler(b8);
    }

    @FXML
    protected void b9Clicked() {
        buttonHandler(b9);
    }

    @FXML
    protected void b10Clicked() {
        buttonHandler(b10);
    }

    @FXML
    protected void b11Clicked() {
        buttonHandler(b11);
    }

    @FXML
    protected void b12Clicked() {
        buttonHandler(b12);
    }

    @FXML
    protected void b13Clicked() {
        buttonHandler(b13);
    }

    @FXML
    protected void b14Clicked() {
        buttonHandler(b14);
    }

    @FXML
    protected void b15Clicked() {
        buttonHandler(b15);
    }

    @FXML
    protected void b16Clicked() {
        buttonHandler(b16);
    }

    @FXML
    protected void b17Clicked() {
        buttonHandler(b17);
    }

    @FXML
    protected void b18Clicked() {
        buttonHandler(b18);
    }

    @FXML
    protected void b19Clicked() {
        buttonHandler(b19);
    }

    @FXML
    protected void b20Clicked() {
        buttonHandler(b20);
    }

    @FXML
    protected void b21Clicked() {
        buttonHandler(b21);
    }

    @FXML
    protected void b22Clicked() {
        buttonHandler(b22);
    }

    @FXML
    protected void b23Clicked() {
        buttonHandler(b23);
    }

    @FXML
    protected void b24Clicked() {
        buttonHandler(b24);
    }

    @FXML
    protected void b25Clicked() {
        buttonHandler(b25);
    }

    @FXML
    protected void b26Clicked() {
        buttonHandler(b26);
    }

    @FXML
    protected void b27Clicked() {
        buttonHandler(b27);
    }

    @FXML
    protected void b28Clicked() {
        buttonHandler(b28);
    }

    @FXML
    protected void b29Clicked() {
        buttonHandler(b29);
    }

    @FXML
    protected void b30Clicked() {
        buttonHandler(b30);
    }

    @FXML
    protected void b31Clicked() {
        buttonHandler(b31);
    }

    @FXML
    protected void b32Clicked() {
        buttonHandler(b32);
    }

    @FXML
    protected void b33Clicked() {
        buttonHandler(b33);
    }

    @FXML
    protected void b34Clicked() {
        buttonHandler(b34);
    }

    @FXML
    protected void b35Clicked() {
        buttonHandler(b35);
    }

    @FXML
    protected void b36Clicked() {
        buttonHandler(b36);
    }
}
