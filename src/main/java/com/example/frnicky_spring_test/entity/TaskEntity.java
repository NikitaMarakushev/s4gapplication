package com.example.frnicky_spring_test.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")
public class TaskEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false, unique=true)
    private Long id;

    @Column(name = "task_name", updatable = false)
    private String taskName;

    @Column(name = "done_until", nullable = false)
    private Date doneUntil;

    @ManyToOne
    @JoinColumn(name = "roadmap_id")
    private RoadmapEntity roadmap;

    public TaskEntity() {
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getRestTimeToDeadline() {
        return new Date(this.doneUntil.getTime() - ((new Date()).getTime()));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(TaskEntity user) {
    }

    public void setDoneUntil(Date doneUntil) {
        this.doneUntil = doneUntil;
    }

    public Date getDoneUntil() {
        return this.doneUntil;
    }
}
