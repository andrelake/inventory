package com.pospuc.inventory.service;

import com.pospuc.inventory.model.User;
import com.pospuc.inventory.model.dto.UserDTO;
import com.pospuc.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDTO create(User user) {
        User savedUser = userRepository.save(user);

        return new UserDTO(savedUser);
    }
}
