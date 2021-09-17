package com.example.frnicky_spring_test.controller;

import com.example.frnicky_spring_test.entity.RoadmapEntity;
import com.example.frnicky_spring_test.service.RoadmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roadmap")
public class RoadmapController {

    @Autowired
    private RoadmapService roadmapService;

    /**
     * @param roadmap
     * @param roadmapName
     * @return
     */
    @PostMapping
    public ResponseEntity createRoadmap(@RequestBody RoadmapEntity roadmap, @RequestParam String roadmapName) {
        try {
            return ResponseEntity.ok(roadmapService.createRoadmap(roadmapName));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Occured error");
        }
    }

    /**
     * @param name
     * @return
     */
    @DeleteMapping("/{name}")
    public ResponseEntity deleteUser(@PathVariable String name) {
        try {
            return ResponseEntity.ok(roadmapService.deleteRoadmap(name));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured while deleting roadmap");
        }
    }
}
