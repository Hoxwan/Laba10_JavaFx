package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField inputField;

    @FXML
    private Label resultLabel;

    @FXML
    public void handleAddition() {
        performOperation("+");
    }

    @FXML
    public void handleSubtraction() {
        performOperation("-");
    }

    @FXML
    public void handleMultiplication() {
        performOperation("*");
    }

    @FXML
    public void handleDivision() {
        performOperation("/");
    }

    private void performOperation(String operation) {
        String[] numbers = inputField.getText().split(",");
        if (numbers.length != 2) {
            resultLabel.setText("Invalid input!");
            return;
        }

        try {
            double num1 = Double.parseDouble(numbers[0].trim());
            double num2 = Double.parseDouble(numbers[1].trim());
            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        resultLabel.setText("Error: Division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input!");
        }
    }
}
