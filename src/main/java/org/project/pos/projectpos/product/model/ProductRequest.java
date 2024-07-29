package org.project.pos.projectpos.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {

    @JsonProperty("id")
    private String id;

    @JsonProperty("product_name")
    private String productName;

    @JsonProperty("category")
    private int category;

    @JsonProperty("stock")
    private int stock;

    @JsonProperty("sku")
    private int sku;

    @JsonProperty("price")
    private String price;

    @JsonProperty("qty")
    private int qty;

    @JsonProperty("status")
    private int status;

    @JsonProperty("image")
    private String image;

    @JsonProperty("product_brand")
    private String productBrand;
}
