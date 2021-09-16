package com.example.frnicky_spring_test.repository;

import com.example.frnicky_spring_test.entity.RoadmapEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoadmapRepo extends CrudRepository<RoadmapEntity, Long> {
    RoadmapEntity findByName(String roadmapName);

    RoadmapEntity deleteByName(String roadmapName);
}
