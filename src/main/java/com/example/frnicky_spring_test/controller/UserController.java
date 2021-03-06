package com.example.frnicky_spring_test.controller;

import com.example.frnicky_spring_test.entity.UserEntity;
import com.example.frnicky_spring_test.exception.UserAlreadyExistsException;
import com.example.frnicky_spring_test.exception.UserNotFoundException;
import com.example.frnicky_spring_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/users/add", consumes = "application/json", produces = "application/json")
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userService.registration(user);
            return ResponseEntity.ok("User is already exists");
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }


    @GetMapping("/users/get/{id}")
    public ResponseEntity getOneUser(@RequestParam Long id) {
        try {
            return ResponseEntity.ok(userService.getOne(id));
        } catch (UserNotFoundException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }

    @DeleteMapping("/users/delete/{id}")
    public ResponseEntity deleteUser(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.delete(id));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error occured");
        }
    }
}