package org.project.pos.projectpos.customer.modal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    @JsonProperty("id")
    private String id;

    @JsonProperty("customer")
    private String customer;

    @JsonProperty("customer_id")
    private int customerId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("country")
    private String country;

    @JsonProperty("country_code")
    private String countryCode;

    @JsonProperty("order")
    private int order;

    @JsonProperty("total_spent")
    private String totalSpent;

    @JsonProperty("image")
    private String image;
}
