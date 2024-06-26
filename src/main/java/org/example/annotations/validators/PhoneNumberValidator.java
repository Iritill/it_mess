package org.example.annotations.validators;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.annotations.PhoneNumberValidation;
import org.example.entity.subEntity.PhoneNumber;



public class PhoneNumberValidator implements ConstraintValidator<PhoneNumberValidation, PhoneNumber> {

    @Override
    public void initialize(PhoneNumberValidation constraintAnnotation) {
    }

    @Override
    public boolean isValid(PhoneNumber phoneNumber, ConstraintValidatorContext context) {
        if(phoneNumber.getLocale()==null || phoneNumber.getValue()==null){
            return false;
        }
        try{
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            return phoneNumberUtil.isValidNumber(phoneNumberUtil.parse(phoneNumber.getValue(), phoneNumber.getLocale()));
        }
        catch (NumberParseException e){
            return false;
        }
    }
}
