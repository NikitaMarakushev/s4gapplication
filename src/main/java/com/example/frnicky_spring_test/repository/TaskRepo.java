package com.example.frnicky_spring_test.repository;

import com.example.frnicky_spring_test.entity.RoadmapEntity;
import com.example.frnicky_spring_test.entity.TaskEntity;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    RoadmapEntity findByName(String taskName);

    RoadmapEntity deleteByName(String taskName);

    RoadmapEntity save(RoadmapEntity roadmap);
}
