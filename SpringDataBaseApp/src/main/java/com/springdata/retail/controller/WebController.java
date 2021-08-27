package com.springdata.retail.controller;

import com.springdata.retail.models.ItemProductGroup;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.service.RetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("postgre")
public class WebController {

    @Autowired
    RetailService retailService;

    @GetMapping(value = "offerList")
    public Optional<ItemProductGroup> getList() {
        return retailService.getItems("100");

    }
}
