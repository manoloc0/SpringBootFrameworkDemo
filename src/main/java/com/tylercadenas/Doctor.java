package com.tylercadenas;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(scopeName = "singleton")
public class Doctor implements Staff, BeanNameAware {
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

    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name is called.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct Method is called.");
    }
}
