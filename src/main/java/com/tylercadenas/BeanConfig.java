package com.tylercadenas;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // You say the same thing that we say in the XML
@ComponentScan(basePackages="com.tylercadenas")
public class BeanConfig {

}
