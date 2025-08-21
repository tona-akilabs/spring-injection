package com.example.spring_injection;


import com.example.spring_injection.config.AppConfig;
import com.example.spring_injection.config.AppScanConfig;
import com.example.spring_injection.service.MyService;
import com.example.spring_injection.service.MyServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class SpringInjectionApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Spring Injection!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppScanConfig.class);

        SimpleModel simpleModel = context.getBean(SimpleModel.class);
        System.out.println("Value from SimpleModel: " + simpleModel.getValue());

        Car car = context.getBean("car", Car.class);
        car.drive();

        MyService myService = context.getBean("myServiceImpl", MyService.class);
        myService.performAction("Test Action");

        myService = context.getBean("myService2Impl", MyService.class);
        myService.performAction("Test Action");

        myService = context.getBean("myServiceOther", MyService.class);
        myService.performAction("Test Action");


        // List all beans in the context
        System.out.println("Beans in the application context:");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
	}

}
