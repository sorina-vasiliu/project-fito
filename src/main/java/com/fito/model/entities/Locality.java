package com.fito.model.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dragos on 3/30/2016.
 */
@Entity
@Table(name = "locality")
public class Locality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int localityId;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "locality")
    private List<Warehouse> warehouses;

    @OneToMany(mappedBy = "locality")
    private List<Agent> agents;

    public int getLocalityId() {
        return localityId;
    }

    public void setLocalityId(int localityId) {
        this.localityId = localityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }
}
