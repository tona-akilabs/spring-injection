package com.example.spring_injection.service;

import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

    @Override
    public void performAction(String action) {
        System.out.println("Performing action: " + action);
    }
}
