package com.example.frnicky_spring_test.controller;

import com.example.frnicky_spring_test.entity.TodoEntity;
import com.example.frnicky_spring_test.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public ResponseEntity createTodo(@RequestBody TodoEntity todo, @RequestParam Long userId) {
        try {
            return ResponseEntity.ok(todoService.createTodo(todo, userId));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Occured error");
        }
    }

    @GetMapping
    public ResponseEntity getOneTodo(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(todoService.getId(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }

    @PutMapping
    public ResponseEntity completeTodo(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(todoService.complete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }
}
