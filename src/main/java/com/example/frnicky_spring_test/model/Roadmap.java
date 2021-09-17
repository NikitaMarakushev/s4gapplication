package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.RoadmapEntity;

public class Roadmap {

    private String name;

    private String type;

    private String description;

    public static Roadmap toModel(RoadmapEntity entity) {
        Roadmap roadmap = new Roadmap();
        roadmap.setName(entity.getName());
        roadmap.setType(entity.getType());
        roadmap.setDescription(entity.getDescription());
        return roadmap;
    }

    public Roadmap() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
