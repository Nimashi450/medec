package com.developersstack.medec.controller;

import com.developersstack.medec.db.Database;
import com.developersstack.medec.dto.DoctorDto;
import com.developersstack.medec.dto.UserDto;
import com.developersstack.medec.enums.Gender;
import com.developersstack.medec.utill.Cookie;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DoctorRegistrationController {
    public TextField txtfname;
    public TextField txtlaname;
    public TextField txtnic;
    public TextField txtemail;
    public TextField txtcontact;
    public TextField txtspecialize;
    public TextArea txtaddress;
    public ToggleGroup gender;
    public JFXRadioButton rbtgender;
    public AnchorPane doctorRegcontext;

    public void initialize(){
        loadUserData();
    }

    private void loadUserData() {
        UserDto selectedUser = Cookie.selectedUser;
        txtfname.setText(selectedUser.getFirtstName());
        txtlaname.setText(selectedUser.getLastName());
        txtemail.setText(selectedUser.getEmail());

    }

    public void registerOnAction(ActionEvent actionEvent) {
        DoctorDto doctorDto = new DoctorDto(
                txtfname.getText().trim(),
                txtlaname.getText().trim(),
                txtnic.getText(),
                txtcontact.getText(),
                txtemail.getText(),
                rbtgender.isSelected()? Gender.MALE: Gender.FEMAILE,
                txtspecialize.getText(),
                txtaddress.getText()

                );

        Database.doctorTable.add(doctorDto);
        Stage stage = (Stage)doctorRegcontext.getScene().getWindow();
        stage.close();
    }
}
