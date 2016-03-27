package com.fito.model.entities;

import javax.persistence.*;

/**
 * Entity class for modeling a user, in the db 'warehouseproduct' table.
 */
@Entity
@Table(name = "warehouseproduct")
public class WarehouseProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouseProductId")
    private Integer warehouseProductId;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "warehouse_id")
    private Warehouse warehouse;

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

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse workhouse) {
        this.warehouse = workhouse;
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

    public Integer getWarehouseProductId() {
        return warehouseProductId;
    }

    public void setWarehouseProductId(Integer warehouseProductId) {
        this.warehouseProductId = warehouseProductId;
    }
}

