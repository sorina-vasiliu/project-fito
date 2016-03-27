package com.fito.model.entities;

import javax.persistence.*;

/**
 * Created by Dragos on 3/27/2016.
 */
@Entity
@Table(name = "client")
@PrimaryKeyJoinColumn(name="clientId", referencedColumnName="id")
public class Client extends User {
    @Column(name="address", nullable = false)
    private String address;

    @Column(name="orderLimit", nullable = false)
    private int orderLimit;

    @OneToOne
    @JoinColumn(name="agent_id", nullable = false)
    private Agent agent;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getOrderLimit() {
        return orderLimit;
    }

    public void setOrderLimit(int orderLimit) {
        this.orderLimit = orderLimit;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
