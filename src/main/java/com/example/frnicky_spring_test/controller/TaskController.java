package com.example.frnicky_spring_test.controller;

import com.example.frnicky_spring_test.entity.TaskEntity;
import com.example.frnicky_spring_test.service.TaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private TaskService taskService;

    /**
     * @param taskName
     * @return
     */
    @PostMapping
    public ResponseEntity createTask(@RequestBody TaskEntity taskName, @RequestParam Long roadmapID) {
        try {
            return ResponseEntity.ok(taskService.createTask(taskName, roadmapID));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Occured error");
        }
    }

    /**
     * @param taskName
     * @return
     */
    @DeleteMapping
    public ResponseEntity getOneTodo(@RequestParam String taskName) {
        try {
            return ResponseEntity.ok(taskService.deleteTask(taskName));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }
}
