package com.enginizer.repository;


import com.enginizer.model.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Spring data repository for retrieving {@link User}s.
 */

@Transactional
@Repository
public interface UserRepository extends CrudRepository<User, String> {

    User findByMail(String mail);
}