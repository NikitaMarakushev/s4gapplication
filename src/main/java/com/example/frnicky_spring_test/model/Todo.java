package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.TodoEntity;
import com.example.frnicky_spring_test.model.modelinterfaces.TodoInterface;

public class Todo<function> implements TodoInterface {

    private Long todoId;

    private String title;

    private Boolean completed;

    public static Todo toModel(TodoEntity entity) {
        Todo model = new Todo();
        model.setId(entity.getId());
        model.setCompleted(entity.getCompleted());
        model.setTitle(entity.getTitle());
        return model;
    }

    public Todo() {
    }

    public Long getId() {
        return todoId;
    }

    public void setId(Long id) {
        this.todoId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void makeCompleted() {
        this.completed = true;
    }

    public void makeNotCompleted() {
        this.completed = false;
    }
}