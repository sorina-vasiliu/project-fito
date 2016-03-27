package com.fito.model.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Entity class for modeling a user, in the db 'warehouse' table.
 */
@Entity
@Table(name = "warehouse")
@PrimaryKeyJoinColumn(name="workhouseId", referencedColumnName="id")
public class Warehouse extends User {
    @Column(name = "location", nullable = false)
    private String location;

    @OneToMany(mappedBy="warehouse")
    private List<Agent> agents;

    @OneToMany(mappedBy = "warehouse")
    private List<WarehouseProduct> warehouseProducts;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Agent> getAgents() {
        return agents;
    }

    public void setAgents(List<Agent> agents) {
        this.agents = agents;
    }

    public List<WarehouseProduct> getWarehouseProducts() {
        return warehouseProducts;
    }

    public void setWarehouseProducts(List<WarehouseProduct> warehouseProducts) {
        this.warehouseProducts = warehouseProducts;
    }
}
