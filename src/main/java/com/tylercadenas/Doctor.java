package com.tylercadenas;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // Tell Spring this is where we'll be defining beans
@Scope(scopeName = "prototype") //Prototype gives you a new Doctor each time. Singleton is the same one each time.
public class Doctor implements Staff {
    private String qualification;

    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public String toString() {
        return "Doctor{" + "qualification='" +qualification +'\'' + '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
