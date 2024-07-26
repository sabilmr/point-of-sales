package org.project.pos.projectpos.product.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponse {

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

    public ProductResponse(ProductEntity entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
