package com.it.firstapplication.controller;

import com.it.firstapplication.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("controllerorder")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("controllerservice")
    @ResponseBody
    public String myService() {
        // log.debug -- debug msg
        // log.info -- info msg
        return "Imtiyaz";
    }
}
