package org.project.pos.projectpos.category.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    @JsonProperty("id")
    private String id;

    @JsonProperty("cat_image")
    private String catImage;

    @JsonProperty("categories")
    private String categories;

    @JsonProperty("category_detail")
    private String categoryDetail;

    @JsonProperty("total_earnings")
    private String totalEarnings;

    @JsonProperty("total_products")
    private int totalProducts;
}
