package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.UserEntity;

public interface UserInterface {

    public static User toModel(UserEntity entity) {
        User user = new User();
        return user;
    }

    public Long getId();

    public void setId(Long id);

    public String getUsername();

    public void setUsername(String userName);
}
