package com.example.aoppointcuts.service;

import com.example.aoppointcuts.model.User;
import com.example.aoppointcuts.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    public User createUser(User user);

    public User getUserById(Long id);

    public void deleteUserById(Long id);

    public List<User> getAllUsers();
}
