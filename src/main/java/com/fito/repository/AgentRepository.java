package com.fito.repository;

import com.fito.model.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring data repository for retrieving {@link com.fito.model.entities.Agent}s.
 */
@Transactional
@Repository
public interface AgentRepository extends JpaRepository<Agent,Integer> {
}
