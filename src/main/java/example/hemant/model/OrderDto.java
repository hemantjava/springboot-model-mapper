package example.hemant.model;

import lombok.Data;

@Data
public class OrderDto {
        String customerFirstName;
        String customerLastName;
        String billingStreet;
        String billingCity;

}
