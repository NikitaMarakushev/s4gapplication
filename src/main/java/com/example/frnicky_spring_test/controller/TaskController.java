package com.example.frnicky_spring_test.controller;

import com.example.frnicky_spring_test.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    @PostMapping
    public ResponseEntity createTask(@RequestBody String taskName) {
        try {
            return ResponseEntity.ok(taskService.createTask(taskName));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Occured error");
        }
    }

    @DeleteMapping
    public ResponseEntity getOneTodo(@RequestParam String taskName) {
        try {
            return ResponseEntity.ok(taskService.deleteRoadmap(taskName));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }
}
