package org.example.common.model.user;


import lombok.Data;

@Data
public class UserModel {
    private Long id;

    private String username;

    private String password;

    private String email;
}
