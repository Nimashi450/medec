package com.developersstack.medec.db;

import com.developersstack.medec.dto.DoctorDto;
import com.developersstack.medec.dto.UserDto;
import com.developersstack.medec.enums.AccountType;
import com.developersstack.medec.enums.Gender;

import java.util.ArrayList;

public class Database {
    public static ArrayList<UserDto> userTable =
            new ArrayList();
    public static ArrayList<DoctorDto> doctorTable = new ArrayList();
    static {
        userTable.add(new UserDto("Nimashi","Uthpala","nimashi@gmail.com",
                "abc", AccountType.PATIENT));
        userTable.add(new UserDto("Dinuth","Gauthika","dinuth@gmail.com",
                "123", AccountType.DOCTOR));
        doctorTable.add(new DoctorDto(
                "Dinuth",
                "Gauthika",
                "1234X",
                "112233",
                "dinuth@gmail.com",
                Gender.MALE,
                "sample 1",
                "Colombo"));

    }
}


