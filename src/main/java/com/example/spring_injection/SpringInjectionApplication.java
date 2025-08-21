package com.example.spring_injection;


import com.example.spring_injection.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInjectionApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Spring Injection!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        SimpleModel simpleModel = context.getBean(SimpleModel.class);
        System.out.println("Value from SimpleModel: " + simpleModel.getValue());
	}

}
