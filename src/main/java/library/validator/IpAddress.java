package library.validator;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotBlank.List;

@Documented
@Constraint(validatedBy = {IpAddressImpl.class})
@Target({FIELD,PARAMETER})
@Retention(RUNTIME)
public @interface IpAddress {
	
	String message() default "{validation.constraints.ip-address.message}";
	Class<?>[] groups() default{ };
	Class<? extends Payload>[] payload() default{ };
	

}
