package org.example.entity.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import org.example.annotations.GoodPassword;
import org.example.annotations.PhoneNumberValidation;

import java.util.Set;

@Data
public class User {
    @NotNull
    @Positive
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
    private Set<Friend> friendsList;
}
