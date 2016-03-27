package com.fito.service;

import com.fito.model.entities.Agent;
import com.fito.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for executing operations of the {@link com.fito.model.entities.Agent} model object.
 */
@Service("AgentService")
public class AgentService {
    @Autowired
    private AgentRepository agentRepository;

    public List<Agent> getAllAgents() {
        return agentRepository.findAll();
    }
}
