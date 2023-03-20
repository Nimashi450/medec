package com.developersstack.medec.dto;

import com.developersstack.medec.enums.AccountType;

public class UserDto {
    private String firtstName;
    private String lastName;
    private String email;
    private String password;
    private AccountType accounttype;

    public UserDto() {
    }

    public UserDto(String firtstName, String lastName, String email, String password, AccountType accounttype) {
        this.firtstName = firtstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.accounttype = accounttype;
    }

    public String getFirtstName() {
        return firtstName;
    }

    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountType getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(AccountType accounttype) {
        this.accounttype = accounttype;
    }
}
