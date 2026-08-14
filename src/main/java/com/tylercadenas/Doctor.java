package com.tylercadenas;

import org.springframework.stereotype.Component;

@Component // Class-level annotation that marks a java class as a spring managed bean.
public class Doctor implements Staff {
    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }

}
