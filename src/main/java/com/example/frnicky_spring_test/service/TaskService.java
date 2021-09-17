package com.example.frnicky_spring_test.service;

import com.example.frnicky_spring_test.entity.TaskEntity;
import com.example.frnicky_spring_test.model.Task;
import com.example.frnicky_spring_test.repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepo;

    public Task createTask(TaskEntity task, Long roadmapId) {
        TaskEntity user = taskRepo.findById(roadmapId).get();
        task.setUser(user);
        return Task.toModel(taskRepo.save(task));
    }

    public Task makeDone(Long id) {
        TaskEntity task = taskRepo.findById(id).get();
        task.setDoneUntil(new Date());
        return Task.toModel(taskRepo.save(task));
    }

    public Task getId(Long id) {
        TaskEntity task = taskRepo.findById(id).get();
        return Task.toModel(taskRepo.save(task));
    }

    public String deleteTask(String taskName) {
        taskRepo.deleteById(taskName);
        return taskName;
    }
}
