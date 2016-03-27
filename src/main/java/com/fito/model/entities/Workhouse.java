package com.fito.model.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dragos on 3/27/2016.
 */
@Entity
@Table(name = "workhouse")
@PrimaryKeyJoinColumn(name="workhouseId", referencedColumnName="id")
public class Workhouse extends User {
    @Column(name = "location", nullable = false)
    private String location;

    @OneToMany(mappedBy="workhouse")
    private List<Agent> agents;

    @OneToMany(mappedBy = "workhouse")
    private List<WorkhouseProduct> workhouseProducts;

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

    public List<WorkhouseProduct> getWorkhouseProducts() {
        return workhouseProducts;
    }

    public void setWorkhouseProducts(List<WorkhouseProduct> workhouseProducts) {
        this.workhouseProducts = workhouseProducts;
    }
}
