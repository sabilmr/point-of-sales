package org.project.pos.projectpos.product.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_product")
public class ProductEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private int category;

    @Column(name = "stock")
    private int stock;

    @Column(name = "sku")
    private int sku;

    @Column(name = "price")
    private String price;

    @Column(name = "qty")
    private int qty;

    @Column(name = "status")
    private int status;

    @Column(name = "image")
    private String image;

    @Column(name = "product_brand")
    private String productBrand;

}
