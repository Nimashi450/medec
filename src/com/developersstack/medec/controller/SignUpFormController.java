package com.developersstack.medec.controller;

import com.developersstack.medec.db.Database;
import com.developersstack.medec.dto.UserDto;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

import static com.sun.scenario.effect.impl.sw.sse.SSEPhongLighting_DISTANTPeer.filter;
import static jdk.nashorn.internal.objects.NativeArray.forEach;

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
            new Alert(Alert.AlertType.WARNING,"Email is already exists!");
        }

    }
}
