package com.fito.model.entities;

import javax.persistence.*;

/**
 * Entity class for modeling a user, in the db 'agent' table.
 */
@Entity
@Table(name = "agent")
@PrimaryKeyJoinColumn(name="agentId", referencedColumnName="id")
public class Agent extends User{
    @Column(name="location", nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name="warehouse_id", nullable = false)
    private Warehouse warehouse;

    @OneToOne(mappedBy="agent",cascade=CascadeType.ALL)
    private Client client;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
