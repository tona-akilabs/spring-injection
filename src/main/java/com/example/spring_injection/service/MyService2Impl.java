package com.example.spring_injection.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService2Impl implements MyService {

    @Override
    public void performAction(String action) {
        System.out.println("Performing action2: " + action);
    }
}
