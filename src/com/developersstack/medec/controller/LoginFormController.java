package com.developersstack.medec.controller;

import com.developersstack.medec.db.Database;
import com.developersstack.medec.dto.UserDto;
import com.developersstack.medec.enums.AccountType;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public JFXTextField txtemail;
    public JFXPasswordField txtpassword;
    public JFXRadioButton rdtndoctor;
    public AnchorPane loginContext;

    public void signInOnAction(ActionEvent actionEvent) {
        //get the correct user
        //check his account type and userName and the password


        String email = txtemail.getText();
        String password = txtpassword.getText();
        AccountType accountType = rdtndoctor.isSelected()? AccountType.DOCTOR : AccountType.PATIENT ;


        for(UserDto dto :Database.userTable){
            if(dto.getEmail().trim().toLowerCase().equals(email)){
                if(dto.getPassword().equals(password)){
                    if(dto.getAccounttype().equals(accountType)){
                        // Complete
                        new Alert(Alert.AlertType.CONFIRMATION, "Login Success!!").show();
                    } else{
                        new Alert(Alert.AlertType.WARNING, "We can't find your Account type!").show();
                        return;
                    }

                }else{
                    new Alert(Alert.AlertType.WARNING,
                            "Your Password is Incorrect!").show();
                    return;
                }
            }
        }

        new Alert(Alert.AlertType.WARNING, "We can't find the email provided!! ");

        
    }

    public void createAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)loginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/SignUpForm.fxml"))));
    }
}
