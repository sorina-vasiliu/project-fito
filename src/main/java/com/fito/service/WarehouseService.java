package com.fito.service;

import com.fito.model.entities.Warehouse;
import com.fito.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for executing operations of the {@link Warehouse} model object.
 */
@Service("WorkhouseService")
public class WarehouseService {
    @Autowired
    private WarehouseRepository workhouseRepository;

    public List<Warehouse> getAllWorkhouses() {
        return workhouseRepository.findAll();
    }
}
