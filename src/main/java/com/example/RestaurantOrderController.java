package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RestaurantOrderController {

    @FXML
    private CheckBox dish1;

    @FXML
    private CheckBox dish2;

    @FXML
    private TextField quantity1;

    @FXML
    private TextField quantity2;

    @FXML
    private Label orderSummary;

    @FXML
    public void handleDishSelection() {
        // Обработка выбора блюда, если необходимо
    }

    @FXML
    public void calculateOrder() {
        double total = 0;
        StringBuilder summary = new StringBuilder("Order Summary:\n");

        if (dish1.isSelected()) {
            int qty = Integer.parseInt(quantity1.getText());
            total += qty * 10;
            summary.append("Dish 1: ").append(qty).append(" x \\$10 = $").append(qty * 10).append("\n");
        }

        if (dish2.isSelected()) {
            int qty = Integer.parseInt(quantity2.getText());
            total += qty * 15;
            summary.append("Dish 2: ").append(qty).append(" x \\$15 = $").append(qty * 15).append("\n");
        }

        summary.append("Total: $").append(total);
        orderSummary.setText(summary.toString());
    }
}
