package com.example.frnicky_spring_test.builder;

import java.util.ArrayList;

public class BuildersDirector {

    public void constructRoadmap(RoadmapBuilder builder) {
        builder.setName("sales team");
        builder.setType("type");
        builder.setDescription("roadmap simple description");
    }
}
