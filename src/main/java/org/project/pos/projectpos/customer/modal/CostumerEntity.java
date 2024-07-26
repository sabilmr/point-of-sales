package org.project.pos.projectpos.customer.modal;

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
@Table(name = "t_costumer")
public class CostumerEntity {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "customer_name")
    private String customer;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "order_count")
    private int order;

    @Column(name = "total_spent")
    private String totalSpent;

    @Column(name = "image")
    private String image;
}
