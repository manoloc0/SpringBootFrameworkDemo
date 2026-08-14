package com.tylercadenas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.tylercadenas")
public class BeanConfig {

    public Doctor doctor() {
        return new Doctor();
    }

}
