package com.example.spring_injection.service;

import org.springframework.stereotype.Service;

@Service("emailTaskService")
public class EmailTaskService implements TaskService {
    @Override
    public void executeTask() {
        System.out.println("Executing email task.");
    }
}
