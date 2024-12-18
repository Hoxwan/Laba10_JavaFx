package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TextFlagController {

    @FXML
    private RadioButton redButton;

    @FXML
    private RadioButton greenButton;

    @FXML
    private RadioButton blueButton;

    @FXML
    private Label flagLabel;

    @FXML
    public void drawFlag() {
        StringBuilder colors = new StringBuilder();

        if (redButton.isSelected()) {
            colors.append("Red, ");
        }
        if (greenButton.isSelected()) {
            colors.append("Green, ");
        }
        if (blueButton.isSelected()) {
            colors.append("Blue, ");
        }

        if (colors.length() > 0) {
            colors.setLength(colors.length() - 2); // Удаляем последнюю запятую и пробел
        }

        flagLabel.setText("Selected Colors: " + colors.toString());
    }
}
