package java.ecommerce.validators;

import java.ecommerce.models.Product;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

public class ProductValidator {


    public boolean supports(Class<?> aClass) {
        return Product.class.equals(aClass);
    }


    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.required");

        Product product = (Product) o;

        if( product.getGroup() == null ){
            errors.rejectValue("group", "group.required");
        }

        if( product.getUserId() == null ){
            errors.rejectValue("userId", "user.required");
        }

    }
}
