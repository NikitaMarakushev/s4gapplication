package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.TodoEntity;

public interface TodoInterface {

    public static Todo toModel(TodoEntity entity) {
        Todo model = new Todo();
        return model;
    }

    public Long getId();

    public void setId(Long id);

    public String getTitle();

    public void setTitle(String title);

    public Boolean getCompleted();

    public void setCompleted(Boolean completed);
}
