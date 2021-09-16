package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.TaskEntity;
import com.example.frnicky_spring_test.model.Task;
import com.example.frnicky_spring_test.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public Task createTask(String taskName) {
        TaskEntity task = taskRepo.findByName(taskName);
        task.setTaskName(taskName);
        return Task.toModel(taskRepo.save(task));
    }

    public String deleteTask(String name) {
        taskRepo.deleteByName(name);
        return name;
    }
}
