package org.example.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.example.annotations.GoodPassword;
import org.example.annotations.PhoneNumberValidation;
import org.example.entity.subEntity.AccessRights;

public class User {
    private Long id;
    private String name;
    @NotNull
    private String login;
    @GoodPassword
    private String password;
    @Email
    private String email;
    @PhoneNumberValidation
    private String phone;
    private AccessRights accessRights;
}
