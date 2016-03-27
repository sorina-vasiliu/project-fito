package com.fito.model.entities;

import ch.qos.logback.classic.db.names.ColumnName;

import javax.persistence.*;

/**
 * Created by Dragos on 3/27/2016.
 */
@Entity
@Table(name = "agent")
@PrimaryKeyJoinColumn(name="agentId", referencedColumnName="id")
public class Agent extends User{
    @Column(name="location", nullable = false)
    private String location;

    @ManyToOne
    @JoinColumn(name="workhouse_id", nullable = false)
    private Workhouse workhouse;

    @OneToOne(mappedBy="agent",cascade=CascadeType.ALL)
    private Client client;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Workhouse getWorkhouse() {
        return workhouse;
    }

    public void setWorkhouse(Workhouse workhouse) {
        this.workhouse = workhouse;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
