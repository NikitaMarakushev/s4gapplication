package com.example.frnicky_spring_test;

import com.example.frnicky_spring_test.builder.BuildersDirector;
import com.example.frnicky_spring_test.builder.RoadmapBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrnickySpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrnickySpringTestApplication.class, args);

		BuildersDirector roadmapBuilderDirector = new BuildersDirector();

		RoadmapBuilder builder = new RoadmapBuilder();
		roadmapBuilderDirector.constructRoadmap(builder);
	}
}
