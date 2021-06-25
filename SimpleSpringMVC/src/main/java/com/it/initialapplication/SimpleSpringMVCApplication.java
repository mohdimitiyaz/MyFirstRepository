package com.it.initialapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SimpleSpringMVCApplication {

    public static  void main(String args[]){
        SpringApplication.run(SimpleSpringMVCApplication.class,args);
    }
}
