package com.example.spring_injection.service;

import org.springframework.stereotype.Service;

@Service("smsTaskService")
public class SmsTaskService implements TaskService {

    @Override
    public void executeTask() {
        System.out.println("Executing SMS task.");
    }
}
