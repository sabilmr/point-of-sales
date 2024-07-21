package org.project.pos.projectpos.category.model;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryResponse {
    private String id;
    private String name;
    private Integer totalProduct;
    private Integer totalEarning;

//    public CategoryResponse(CategoryEntity entity) {
//        BeanUtils.copyProperties(entity, this);
//    }
}
