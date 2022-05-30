package java.ecommerce.hateoas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.ecommerce.models.Product;
import org.springframework.hateoas.RepresentationModel;

public class ProductResource extends RepresentationModel {

    @JsonProperty
    public long id;
    public String name;
    public String price;
    public String description;
    public Object group;

    public ProductResource(Product model){
        id = model.getId();
        name = model.getName();
        price = model.getPrice();
        description = model.getDescription();
        group = model.getGroup();
    }

}