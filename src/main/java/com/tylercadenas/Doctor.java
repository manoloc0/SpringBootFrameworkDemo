package com.tylercadenas;

import org.springframework.stereotype.Component;

public class Doctor implements Staff {
    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }

}
