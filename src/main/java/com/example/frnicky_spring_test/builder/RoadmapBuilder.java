package com.example.frnicky_spring_test.builder;

import com.example.frnicky_spring_test.entity.RoadmapEntity;

public class RoadmapBuilder implements BuilderInterface {

    String name;

    String type;

    String description;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return RoadmapEntity
     */
    public RoadmapEntity buildRoadmap() {
        return new RoadmapEntity(
                name,
                type,
                description
        );
    }
}
