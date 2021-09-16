package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.RoadmapEntity;
import com.example.frnicky_spring_test.model.Roadmap;
import com.example.frnicky_spring_test.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public Roadmap createRoadmap(String roadmapName) {
        RoadmapEntity roadmap = taskRepo.findByName(roadmapName);
        roadmap.setName(roadmapName);
        return Roadmap.toModel(taskRepo.save(roadmap));
    }

    public String deleteRoadmap(String name) {
        taskRepo.deleteByName(name);
        return name;
    }
}
