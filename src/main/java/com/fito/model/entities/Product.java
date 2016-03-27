package com.fito.model.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dragos on 3/27/2016.
 */
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "details")
    private String details;

    @OneToMany(mappedBy = "product")
    private List<WorkhouseProduct> workhouseProducts;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public List<WorkhouseProduct> getWorkhouseProducts() {
        return workhouseProducts;
    }

    public void setWorkhouseProducts(List<WorkhouseProduct> workhouseProducts) {
        this.workhouseProducts = workhouseProducts;
    }
}
