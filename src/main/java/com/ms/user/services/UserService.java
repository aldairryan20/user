package com.ms.user.services;

import org.springframework.stereotype.Service;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    
    UserRepository repository;
    public UserService(UserRepository userRepository){
        repository = userRepository;
    }
    
    @Transactional
    public UserModel save(UserModel userModel){
        return repository.save(userModel);
    }
    
}
