package com.example.frnicky_spring_test.repository;

import com.example.frnicky_spring_test.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserEntity, Long> {
    UserEntity findByUserName(String userName);
}
