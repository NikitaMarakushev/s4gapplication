package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.UserEntity;
import com.example.frnicky_spring_test.exception.UserAlreadyExistsException;
import com.example.frnicky_spring_test.exception.UserNotFoundException;
import com.example.frnicky_spring_test.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserEntity registration(UserEntity user) throws UserAlreadyExistsException {
        if (userRepo.findByUserName(user.getUsername()) != null) {
            throw new UserAlreadyExistsException("exists");
        }
        return userRepo.save(user);
    }

    public UserEntity getOne(Long id) throws UserNotFoundException {
        UserEntity user = userRepo.findById(id).get();
        if (user == null) {
            throw new UserNotFoundException("user not found");
        }
        return user;
    }
}

