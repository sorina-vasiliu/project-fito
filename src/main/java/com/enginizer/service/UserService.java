package com.enginizer.service;

import com.enginizer.model.entities.User;
import com.enginizer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for executing operations of the {@link User} model object..
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByEmailAddress(final String mail) {
        return userRepository.findByMail(mail);
    }

}
