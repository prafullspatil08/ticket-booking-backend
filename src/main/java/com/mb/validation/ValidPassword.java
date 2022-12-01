package com.mb.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.TYPE_USE})
@Constraint(validatedBy = PasswordValidator.class)
public @interface ValidPassword
{

	String message() default "Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character is required:";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
