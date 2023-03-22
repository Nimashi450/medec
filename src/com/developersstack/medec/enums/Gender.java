package com.developersstack.medec.enums;

public enum Gender {
    MALE(1), FEMAIL(2);
    final int state;

    Gender(int state) {
        this.state = state;
    }
}
