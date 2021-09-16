package com.example.frnicky_spring_test.model;

import com.example.frnicky_spring_test.model.modelinterfaces.TaskInterface;

public class ComplexTask implements TaskInterface {

    private String statusComplexTask;

    @Override
    public void makeInProgress() {
        this.statusComplexTask = "in progress";
    }

    @Override
    public void makeAssigned() {
        this.statusComplexTask = "assigned";
    }

    @Override
    public void makeFinished() {
        this.statusComplexTask = "finished";
    }
}
