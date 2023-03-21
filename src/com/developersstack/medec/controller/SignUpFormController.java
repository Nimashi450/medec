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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class SignUpFormController {
    public AnchorPane signUpContext;
    public JFXTextField txtFirstName;
    public JFXTextField txtLastName;
    public JFXTextField txtEmail;
    public JFXPasswordField txtPassword;
    public JFXRadioButton rdtndoctor;


    public void AlreadyHaveAnAccountOnAction(ActionEvent actionEvent) throws IOException {
        rediretUI();
    }

    public void signUpOnAction(ActionEvent actionEvent) throws IOException {
        // users with same email should be restricted
        String email = txtEmail.getText();
//        for(UserDto dto:Database.userTable){
//            if(dto.getEmail().equals(email.trim().toLowerCase())){
//                new Alert(Alert.AlertType.WARNING, "Email is already existed");
//                return ;
//            }
//        }
        Optional<UserDto> selectedUser = Database.userTable.stream()
                .filter(e -> e.getEmail().equals(email.trim().toLowerCase()))
                .findFirst();
        if(selectedUser.isPresent()){
            new Alert(Alert.AlertType.WARNING,"Email is already exists!").show();
            return ;
        }

        Database.userTable.add(
            new UserDto(txtFirstName.getText(),
                    txtLastName.getText(),
                    email,
                    txtPassword.getText(),
                    rdtndoctor.isSelected()? AccountType.DOCTOR :AccountType.PATIENT)
        );
        new Alert(Alert.AlertType.CONFIRMATION,"Welcome!").show();
        rediretUI();
    }

    private void rediretUI() throws IOException {
        Stage stage = (Stage)signUpContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));

    }
}
