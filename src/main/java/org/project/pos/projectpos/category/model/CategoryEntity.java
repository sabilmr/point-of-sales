package org.project.pos.projectpos.category.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_category")
public class CategoryEntity {
    @Id
    private String id;

    @Column(name = "cat_image")
    private String catImage;

    @Column(name = "categories")
    private String categories;

    @Column(name = "category_detail")
    private String categoryDetail;

    @Column(name = "total_earnings")
    private String totalEarnings;

    @Column(name = "total_products")
    private int totalProducts;
}

