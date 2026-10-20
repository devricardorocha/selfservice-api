package com.devricardorocha.selfservice.api.msuser.model.validators;

import com.devricardorocha.selfservice.api.msuser.context.LegalWorkAgeContext;
import com.devricardorocha.selfservice.api.msuser.model.validators.annotations.LegalAge;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.LocalDate;
import java.time.Period;

public class LegalAgeValidator implements ConstraintValidator<LegalAge, LocalDate> {

    @Override
    public boolean isValid(LocalDate value, ConstraintValidatorContext context) {
        return value != null && isAboveMinimumLegalWorkAge(value);
    }

    private boolean isAboveMinimumLegalWorkAge(LocalDate value) {
        final int minAge = LegalWorkAgeContext.getInstance().getLegalWorkAge();
        final int userAge = Period.between(value, LocalDate.now()).getYears();
        return userAge >= minAge;
    }
}
