package com.developersstack.medec.utill;

import com.developersstack.medec.db.Database;
import com.developersstack.medec.dto.UserDto;

public class Cookie {
    public static UserDto selectedUser = Database.userTable.get(1); //default value NULL



}
