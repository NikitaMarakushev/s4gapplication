package com.example.frnicky_spring_test.repository;
import com.example.frnicky_spring_test.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    TaskEntity findByName(String taskName);

    TaskEntity deleteByName(String taskName);

    TaskEntity save(TaskEntity roadmap);
}
