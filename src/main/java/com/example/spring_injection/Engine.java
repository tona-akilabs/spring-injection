package com.example.spring_injection;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public void start() {
        System.out.println("Engine started!");
    }
}
