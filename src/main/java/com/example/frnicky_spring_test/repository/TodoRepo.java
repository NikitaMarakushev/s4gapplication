package com.example.frnicky_spring_test.repository;

import com.example.frnicky_spring_test.entity.TodoEntity;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepo extends CrudRepository<TodoEntity, Long> {
}
