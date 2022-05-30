package java.ecommerce.validators;

import java.ecommerce.models.Order;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class OrderValidator {

    public boolean supports(Class<?> aClass) {
        return Order.class.equals(aClass);
    }

    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");

        Order order = (Order) o;

        if( order.getName().length() < 2 ){
            errors.rejectValue("name", "name.required");
        }

        if(order.getItems()==null || order.getItems().size() < 1){
            errors.rejectValue("items", "items.required");
        }
    }
}
