package org.project.pos.projectpos.category.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryRequest {
    private String id;
    private String name;
    private Integer totalProduct;
    private Integer totalEarning;
}
