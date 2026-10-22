package com.devricardorocha.selfservice.api.msemployee.model.validators.annotations;

import com.devricardorocha.selfservice.api.msemployee.model.validators.LegalAgeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LegalAgeValidator.class)
public @interface LegalAge {

    String message() default "Employee younger than allowed work legal age";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
