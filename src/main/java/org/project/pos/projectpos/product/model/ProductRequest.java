package org.project.pos.projectpos.product.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private String id;
    private String productName;
    private String category;
    private Integer sku;
    private Integer price;
    private Integer quantity;
    private String status;
}
