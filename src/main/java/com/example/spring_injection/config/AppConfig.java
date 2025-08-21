package com.example.spring_injection.config;

import com.example.spring_injection.Car;
import com.example.spring_injection.Engine;
import com.example.spring_injection.SimpleModel;
import com.example.spring_injection.service.MyService;
import com.example.spring_injection.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
        SimpleModel simpleModel = new SimpleModel();
        simpleModel.setValue("10");
        return simpleModel;
    }

    @Bean
    public SimpleModel simpleModel2(@Value("${value}") String value) {
        return new SimpleModel(value);
    }

    @Bean
    public Car car2(@Qualifier("engine2") Engine engine2) {
        return new Car(engine2);
    }

    @Bean
    public Engine engine2() {
        return new Engine();
    }

    @PostConstruct
    public void init() {
        System.out.println("AppConfig initialized.");
    }

    @Bean
    MyService myServiceOther() {
        return new MyServiceImpl();
    }
}
