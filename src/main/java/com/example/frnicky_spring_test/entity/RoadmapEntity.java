package com.example.frnicky_spring_test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "roadmap")
public class RoadmapEntity {

    private String name;

    private String type;

    private String description;

    private ArrayList tasks;

    public RoadmapEntity(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void getAllTasksInfo() {

    }
}
