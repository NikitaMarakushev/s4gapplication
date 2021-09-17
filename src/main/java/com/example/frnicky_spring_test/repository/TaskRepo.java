package com.example.frnicky_spring_test.repository;
import com.example.frnicky_spring_test.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    void deleteById(String taskName);
}
