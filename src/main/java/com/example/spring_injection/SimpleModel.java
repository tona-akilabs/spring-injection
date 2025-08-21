package com.example.spring_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class SimpleModel {
    @Value("${defaultValue}")
    private String value;

    public String getValue() {
        return value;
    }
}
