package com.example.spring_injection.config;

import com.example.spring_injection.Car;
import com.example.spring_injection.Engine;
import com.example.spring_injection.SimpleModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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

    /*@Bean
    public Car car() {
        return new Car(engine());
    }

    @Bean
    public Engine engine() {
        return new Engine();
    }*/

    @PostConstruct
    public void init() {
        System.out.println("AppConfig initialized.");
    }
}
