package com.developersstack.medec.controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {
    public AnchorPane signUpContext;
    public JFXTextField txtFirstName;
    public JFXTextField txtLastName;
    public JFXTextField txtEmail;
    public JFXPasswordField txtPassword;


    public void AlreadyHaveAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)signUpContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));

    }

    public void signUpOnAction(ActionEvent actionEvent) {
    }
}
