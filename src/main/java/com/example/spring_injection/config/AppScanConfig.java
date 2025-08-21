package com.example.spring_injection.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.spring_injection")
public class AppScanConfig {
    // This class is used to specify the base package for component scanning.
    // It will automatically detect and register beans in the specified package.
    // No additional configuration is needed here.
    // The @ComponentScan annotation will scan the specified package and its sub-packages
    // for components, configurations, and services annotated with @Component, @Service, @Repository
    // and @Controller annotations.
}
