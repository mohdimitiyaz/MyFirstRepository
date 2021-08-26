package com.springdata.retail.controller;

import com.springdata.retail.dao.Item_Product_Group;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.service.RetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("postgre")
public class PostmanController {

    @Autowired
    RetailService retailService;

    @GetMapping(value = "orderList")
    public Iterable<Item_Product_Group> getList() {
        return retailService.innerJoinData();

    }
}
