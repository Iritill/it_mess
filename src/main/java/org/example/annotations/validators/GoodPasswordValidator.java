package org.example.annotations.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.annotations.GoodPassword;


public class GoodPasswordValidator implements ConstraintValidator<GoodPassword, String> {
    @Override
    public boolean isValid(String userPassword, ConstraintValidatorContext constraintValidatorContext) {
        return userPassword.matches("^(?=.*[A-Z])(?=.*[0-9])[A-Z0-9]+$");
    }
}