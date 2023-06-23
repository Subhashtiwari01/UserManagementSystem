package com.Adi.UserManagement.System.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer UserId;
    private String Name;
    private String Address;
    private String ContactNumber;

}
