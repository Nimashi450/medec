package com.developersstack.medec.controller;

import com.developersstack.medec.utill.Cookie;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DoctorDashboardFormController {
    public AnchorPane DoctorDashboardContext;

    public void initialize() throws IOException {
        checkUser();
    }
    public void checkUser() throws IOException {
        if(null == Cookie.selectedUser){
            Stage stage = (Stage)DoctorDashboardContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorDashboard.fxml"))));
            stage.centerOnScreen();

        }
    }
}
