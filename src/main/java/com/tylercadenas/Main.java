package com.tylercadenas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Application Context extends Bean factory; there's more features to Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Staff doctor = context.getBean(Doctor.class);
        doctor.assist();

        Staff nurse = (Nurse) context.getBean("nurse"); //Can get bean via ID as well; need to cast it though
        nurse.assist();
    }
}