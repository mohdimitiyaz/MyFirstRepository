package com.it.firstapplication.controller;

import com.it.firstapplication.dao.model.OrderModel;
import com.it.firstapplication.service.OrderModelService;
import com.it.firstapplication.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("postGre")
public class PostGreController {

    @Autowired
    OrderService orderService;
    @Autowired
    OrderModelService orderModelService;

    @GetMapping(value = "orderList")
    public List<OrderModel> getAllOrders() {
        return orderService.findAll();

    }

    @PostMapping(value = "createOrderModel")
    public void createEmployee(@RequestBody OrderModel orderModel) {
        orderService.insertOrder(orderModel);

    }
    @GetMapping(value = "orderList")
    public List<OrderModel> getList() {
       return orderModelService.bulkCreate();

    }
    }


