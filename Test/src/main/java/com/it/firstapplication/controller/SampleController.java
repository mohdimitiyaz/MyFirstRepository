package com.it.firstapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestController
@RequestMapping("sample")
public class SampleController {

    @GetMapping("common")
    public String secondService(){
        return "Sample";
    }
}
