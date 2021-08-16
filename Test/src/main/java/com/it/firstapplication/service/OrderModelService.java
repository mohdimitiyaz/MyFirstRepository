package com.it.firstapplication.service;

import com.it.firstapplication.dao.OrderDao;
import com.it.firstapplication.dao.OrderRepository;
import com.it.firstapplication.dao.model.OrderModel;
import com.it.firstapplication.dto.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderModelService {

    @Autowired
    OrderRepository repository;

    public List<OrderModel> bulkCreate() {
// save a single Customer
        List<OrderModel> orderModels = new ArrayList<>();
        OrderModel orderModel = new OrderModel("5555", "2222", "6666", "55555");
       OrderModel saveOrderModel =  repository.save(orderModel);
       orderModels.add(saveOrderModel);
// save a list of Customers;
        return orderModels;
    }
}
