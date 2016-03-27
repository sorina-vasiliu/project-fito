package com.fito.service;

import com.fito.model.entities.Client;
import com.fito.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for executing operations of the {@link com.fito.model.entities.Client} model object.
 */
@Service("ClientService")
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}

