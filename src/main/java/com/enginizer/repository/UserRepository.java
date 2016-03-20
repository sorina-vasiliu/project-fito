package com.enginizer.repository;


import com.enginizer.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring data repository for retrieving {@link User}s.
 */

@Transactional
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByMail(String mail);
}