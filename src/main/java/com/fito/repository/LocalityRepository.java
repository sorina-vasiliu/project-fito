package com.fito.repository;

import com.fito.model.entities.Locality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring data repository for retrieving {@link com.fito.model.entities.Locality}s.
 */
@Transactional
@Repository
public interface LocalityRepository extends JpaRepository<Locality,Integer> { }

