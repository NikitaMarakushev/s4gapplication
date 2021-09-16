package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.RoadmapEntity;
import com.example.frnicky_spring_test.model.Roadmap;
import com.example.frnicky_spring_test.repository.RoadmapRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoadmapService {

    @Autowired
    private RoadmapRepo roadmapRepo;

    public Roadmap createRoadmap(String roadmapName) {
        RoadmapEntity roadmap = roadmapRepo.findByName(roadmapName);
        roadmap.setName(roadmapName);
        return Roadmap.toModel(roadmapRepo.save(roadmap));
    }

    public String deleteRoadmap(String name) {
        roadmapRepo.deleteByName(name);
        return name;
    }
}
