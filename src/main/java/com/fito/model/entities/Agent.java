package com.fito.model.entities;

import javax.persistence.*;
import java.util.List;

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

    @OneToMany(mappedBy="agent")
    private List<Client> clients;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public List<Client> getClient() {
        return clients;
    }

    public void setClient(List<Client> client) {
        this.clients = clients;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }
}
