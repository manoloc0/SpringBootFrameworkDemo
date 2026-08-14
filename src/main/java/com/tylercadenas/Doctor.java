package com.tylercadenas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Doctor implements Staff {

    // Beans are loaded into the container.
    //Qualification qualification; // Tightly coupled -- If you have a doctor, you NEED a qualification. What's better: loose coupling; we shouldn't rely on Qualification
    // Spring is like an orchestrator: Spring's job will be to use the Reference graph to take care of instantiation of objects. It's like an orchestrator. (Inversion of Control)

    public void assist(){


        System.out.println("Doctor is assisting");
    }
}
