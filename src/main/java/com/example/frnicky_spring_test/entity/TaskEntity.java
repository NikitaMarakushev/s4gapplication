package com.example.frnicky_spring_test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class TaskEntity {

    private String taskName;

    public TaskEntity() {

    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }
}
