package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.TodoEntity;
import com.example.frnicky_spring_test.entity.UserEntity;
import com.example.frnicky_spring_test.model.Todo;
import com.example.frnicky_spring_test.repository.UserRepo;
import com.example.frnicky_spring_test.repository.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepo todoRepo;

    @Autowired
    private UserRepo userRepo;

    public Todo createTodo(TodoEntity todo, Long userId) {
        UserEntity user = userRepo.findById(userId).get();
        todo.setUser(user);
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo complete(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        todo.setCompleted(!todo.getCompleted());
        return Todo.toModel(todoRepo.save(todo));
    }

    public Todo getId(Long id) {
        TodoEntity todo = todoRepo.findById(id).get();
        return Todo.toModel(todoRepo.save(todo));
    }
}