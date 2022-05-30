package java.ecommerce.hateoas;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.ecommerce.models.ProductGroup;
import org.springframework.hateoas.RepresentationModel;

import java.util.List;

public class GroupResource extends RepresentationModel{
    @JsonProperty
    public long id;
    public String groupName;
    public String price;

    public GroupResource(ProductGroup group){
        this.id = group.getId();
        this.groupName = group.getGroupName();
        this.price = group.getPrice();
    }
}