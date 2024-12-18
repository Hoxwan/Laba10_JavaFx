package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class WordSwitcherController {

    @FXML
    private TextField inputField;

    @FXML
    private TextField outputField;

    @FXML
    private Button switchButton;

    private boolean isSwitched = false;

    @FXML
    public void handleSwitch() {
        if (isSwitched) {
            outputField.setText(inputField.getText());
            switchButton.setText("→");
        } else {
            inputField.setText(outputField.getText());
            switchButton.setText("←");
        }
        isSwitched = !isSwitched;
    }
}
