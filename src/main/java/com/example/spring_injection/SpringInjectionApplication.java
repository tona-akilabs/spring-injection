package com.example.spring_injection;


import com.example.spring_injection.config.AppConfig;
import com.example.spring_injection.config.AppScanConfig;
import com.example.spring_injection.service.MyService;
import com.example.spring_injection.service.MyServiceImpl;
import com.example.spring_injection.service.TaskService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInjectionApplication {

	public static void main(String[] args) {
		System.out.println("Hello, Spring Injection!");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppScanConfig.class);

        SimpleModel simpleModel = context.getBean("simpleModel", SimpleModel.class);
        System.out.println("Value from SimpleModel: " + simpleModel.getValue());
        simpleModel = context.getBean("simpleModel2", SimpleModel.class);
        System.out.println("Value from SimpleModel2: " + simpleModel.getValue());

        Car car = context.getBean("car", Car.class);
        car.drive();

        MyService myService = context.getBean("myServiceImpl", MyService.class);
        myService.performAction("Test Action");

        myService = context.getBean("myService2Impl", MyService.class);
        myService.performAction("Test Action");

        myService = context.getBean("myServiceOther", MyService.class);
        myService.performAction("Test Action");

        TaskService taskService = context.getBean("emailTaskService", TaskService.class);
        taskService.executeTask();
        taskService = context.getBean("smsTaskService", TaskService.class);
        taskService.executeTask();


        /*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Project project = context.getBean("projectBean", Project.class);
        System.out.println("Project Info: " + project);*/

        // List all beans in the context
        System.out.println("Beans in the application context:");
        String[] beanNames = context.getBeanDefinitionNames();
        for (String name : beanNames) {
            System.out.println(name);
        }
	}

}
