package com.fito.model.entities;

import javax.persistence.*;

/**
 * Created by Dragos on 3/27/2016.
 */
@Entity
@Table(name = "workhouseproduct")
public class WorkhouseProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "workhouseProductId")
    private Integer workhouseProductId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "workhouse_id")
    private Workhouse workhouse;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Workhouse getWorkhouse() {
        return workhouse;
    }

    public void setWorkhouse(Workhouse workhouse) {
        this.workhouse = workhouse;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getWorkhouseProductId() {
        return workhouseProductId;
    }

    public void setWorkhouseProductId(Integer workhouseProductId) {
        this.workhouseProductId = workhouseProductId;
    }
}

