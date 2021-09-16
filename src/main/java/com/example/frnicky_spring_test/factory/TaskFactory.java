package com.example.frnicky_spring_test.factory;

import com.example.frnicky_spring_test.model.ComplexTask;
import com.example.frnicky_spring_test.model.Task;

public class TaskFactory implements TaskFactoryInterface {
    @Override
    public Task createTask() {
        return new Task();
    }

    @Override
    public ComplexTask createComplexTask() {
        return new ComplexTask();
    }
}
