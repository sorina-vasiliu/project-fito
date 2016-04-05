package com.fito.service;

import com.fito.model.entities.Locality;
import com.fito.model.entities.Warehouse;
import com.fito.repository.WarehouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for executing operations of the {@link Warehouse} model object.
 */
@Service("WorkhouseService")
public class WarehouseService {
    @Autowired
    private WarehouseRepository workhouseRepository;

    @Value("${users.predefined.password}")
    private String definedInitialPassword;

    public List<Warehouse> getAllWorkhouses() {
        return workhouseRepository.findAll();
    }

    public void createWarehouse(Warehouse warehouse) {
        warehouse.setPassword(definedInitialPassword);
        workhouseRepository.save(warehouse);
    }

    public Warehouse getWarehouseById(int id) {
       return workhouseRepository.findOne(id);
    }
}
