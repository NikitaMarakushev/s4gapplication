package com.example.frnicky_spring_test.entity;

import javax.persistence.*;

@Entity
@Table(name = "roadmap")
public class RoadmapEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;

    private String name;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;

    public RoadmapEntity(
            String name,
            String type,
            String description
    ) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
