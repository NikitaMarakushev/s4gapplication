package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.TaskEntity;
import com.example.frnicky_spring_test.model.modelinterfaces.TaskInterface;

import java.util.Date;

public class Task<function> implements TaskInterface {

    private Long taskId;

    private String taskName;

    private Date doneUntil;

    private String title;

    private String completed;

    public static Task toModel(TaskEntity entity) {
        Task model = new Task();
        model.setTaskName(entity.getTaskName());
        model.setDoneUntil(entity.getRestTimeToDeadline());
        return model;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDoneUntil(Date doneUntil) {
        this.doneUntil = doneUntil;
    }

    public Long getId() {
        return taskId;
    }

    public void setId(Long taskId) {
        this.taskId = taskId;
    }

    public void makeInProgress() {
        this.completed = "this task is in progress!";
    }

    public void makeAssigned() {
        this.completed = "this task is assigned!";
    }

    public void makeFinished() {
        this.completed = "this task is finished!";
    }
}
