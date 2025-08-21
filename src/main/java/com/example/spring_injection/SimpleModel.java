package com.example.spring_injection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class SimpleModel {
    // @Value("${defaultValue}")
    private String value;

    public SimpleModel() {
        // Default constructor
    }

    public SimpleModel(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }
}
