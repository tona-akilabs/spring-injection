package com.example.spring_injection.config;

import com.example.spring_injection.SimpleModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import jakarta.annotation.PostConstruct;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public SimpleModel simpleModel() {
        return new SimpleModel();
    }

    @PostConstruct
    public void init() {
        System.out.println("AppConfig initialized.");
    }
}
