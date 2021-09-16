package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.entity.TaskEntity;

import java.util.Date;

public class Task {

    private String taskName;

    private Date doneUntil;

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
}
