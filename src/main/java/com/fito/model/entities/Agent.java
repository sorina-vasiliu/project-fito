package com.fito.model.entities;

import javax.persistence.*;

/**
 * Entity class for modeling a user, in the db 'agent' table.
 */
@Entity
@Table(name = "agent")
@PrimaryKeyJoinColumn(name="agentId", referencedColumnName="id")
public class Agent extends User{
    @ManyToOne
    @JoinColumn(name="locality_id", nullable = false)
    private Locality locality;

    @ManyToOne
    @JoinColumn(name="warehouse_id", nullable = false)
    private Warehouse warehouse;

    @OneToOne(mappedBy="agent",cascade=CascadeType.ALL)
    private Client client;

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

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }
}
