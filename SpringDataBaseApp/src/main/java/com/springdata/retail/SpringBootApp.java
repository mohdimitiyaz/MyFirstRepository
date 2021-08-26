package com.springdata.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.springdata.retail")
@SpringBootApplication
public class SpringBootApp {

    public static void main(String... args){
        SpringApplication.run(SpringBootApp.class, args);
    }
}
