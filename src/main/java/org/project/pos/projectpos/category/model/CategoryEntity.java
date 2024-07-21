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

    @Column(name = "name")
    private String name;

    @Column(name = "total_product")
    private Integer totalProduct;

    @Column(name = "total_earning")
    private Integer totalEarning;
}

