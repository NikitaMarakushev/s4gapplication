package com.example.frnicky_spring_test.factory;

import com.example.frnicky_spring_test.model.ComplexTask;
import com.example.frnicky_spring_test.model.Task;

interface TaskFactoryInterface {
    Task createTask();
    ComplexTask createComplexTask();
}
