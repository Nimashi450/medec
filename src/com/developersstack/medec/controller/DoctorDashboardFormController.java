package com.developersstack.medec.controller;

import com.developersstack.medec.utill.Cookie;
import com.sun.org.apache.bcel.internal.generic.DADD;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoctorDashboardFormController {
    public AnchorPane DoctorDashboardContext;
    public Label lbldate;
    public Label lbltime;

    public void initialize() throws IOException {
        //checkUser();
        initializeData();
    }

    private void initializeData() {
//        Date date = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String today = simpleDateFormat.format(date);
//        lbldate.setText(today);
        lbldate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
    }

    public void checkUser() throws IOException {
        if(null == Cookie.selectedUser){
            Stage stage = (Stage)DoctorDashboardContext.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DoctorDashboard.fxml"))));
            stage.centerOnScreen();

        }
    }
}
