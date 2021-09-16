package com.example.frnicky_spring_test.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "task")
public class TaskEntity {

    private String taskName;

    private Date doneUntil;

    public TaskEntity() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDoneUntil(Date doneUntil) {
        this.doneUntil = doneUntil;
    }

    public Date getRestTimeToDeadline() {
        return new Date(this.doneUntil.getTime() - ((new Date()).getTime()));
    }
}
