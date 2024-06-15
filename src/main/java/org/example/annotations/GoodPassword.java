package org.example.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import org.example.annotations.validators.GoodPasswordValidator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = GoodPasswordValidator.class)
public @interface GoodPassword {
    String message() default "Ненадежный пароль!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}