package com.developersstack.medec.db;

import com.developersstack.medec.dto.UserDto;
import com.developersstack.medec.enums.AccountType;

import java.util.ArrayList;

public class Database {
    public static ArrayList<UserDto> userTable =
            new ArrayList();

    static {
        userTable.add(new UserDto("Nimashi","Uthpala","nimashi@gmail.com",
                "abc", AccountType.PATIENT));
        userTable.add(new UserDto("Dinuth","Gauthika","dinuth@gmail.com",
                "123", AccountType.DOCTOR));

    }
}


