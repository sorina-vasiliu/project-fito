package com.fito.service;

import com.fito.model.entities.Locality;
import com.fito.repository.LocalityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for executing operations of the {@link com.fito.model.entities.Client} model object.
 */
@Service("LocalityService")
public class LocalityService {
    @Autowired
    private LocalityRepository localitRepository;

    public List<Locality> getAllLocations() {
        return localitRepository.findAll();
    }
}


