package com.ecom.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfiguration {

    @Bean
    @Scope(value = "prototype")
    public DeleteUtil getMyBean(){
        return new DeleteUtil();
    }
}
