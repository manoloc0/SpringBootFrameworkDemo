package com.tylercadenas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Application Context extends Bean factory; there's more features to Application Context
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class); //Context gives us beans. Spring will need to scan some packages for that -- so we annotate those with @Component and, in our BeanConfig, we set the base-package for where Spring should scan. TLDR, we're using ANNOTATIONS to give us an APPLICATION CONTEXT and we define where Spring gets the beans from a CONFIG file. Therfore, it's a AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();

        Staff nurse = context.getBean(Nurse.class);
        nurse.assist();

    }
}