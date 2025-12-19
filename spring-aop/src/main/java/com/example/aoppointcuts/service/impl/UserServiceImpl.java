package com.example.aoppointcuts.service.impl;

import com.example.aoppointcuts.model.User;
import com.example.aoppointcuts.repository.UserRepository;
import com.example.aoppointcuts.util.AuditedMethod;
import com.example.aoppointcuts.util.AuditedService;
import com.example.aoppointcuts.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AuditedService
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @AuditedMethod
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
