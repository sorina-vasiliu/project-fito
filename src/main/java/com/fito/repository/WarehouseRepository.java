package com.fito.repository;

import com.fito.model.entities.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring data repository for retrieving {@link Warehouse}s.
 */

public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> { }
