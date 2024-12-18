package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;

public class WidgetsController {

    @FXML
    private TextField widget1;

    @FXML
    private TextField widget2;

    @FXML
    private TextField widget3;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private CheckBox checkBox3;

    @FXML
    public void handleCheckBox1() {
        widget1.setVisible(checkBox1.isSelected());
    }

    @FXML
    public void handleCheckBox2() {
        widget2.setVisible(checkBox2.isSelected());
    }

    @FXML
    public void handleCheckBox3() {
        widget3.setVisible(checkBox3.isSelected());
    }
}
