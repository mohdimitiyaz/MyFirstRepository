package com.retail.controller;

import ch.qos.logback.core.joran.action.IADataForComplexProperty;
import com.retail.dto.OrderModel;
import com.retail.service.OrderService;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("postGre")
public class PostGreController {

    @Autowired
    OrderService orderService;

    @GetMapping(value = "orderList")
    public Iterable<OrderModel> getList() {
        return orderService.bulkCreate();

    }

    @PostMapping(value = "postOrderList")
    public List<OrderModel> postList(@RequestBody List<OrderModel> orderModels) {
        return orderService.create(orderModels);
    }

    /* @GetMapping("ordersByHeader")
     public List<Order> ordersByHeader(@RequestHeader String itemCode, @RequestHeader String orderId) {
         return testService.fetchOrdersByOrderId(orderId, itemCode);
     }*/
    @GetMapping(value = "specificOrderList/{memberId}")
    public List<OrderModel> orderList(@PathVariable(value = "memberId") String memberId) {
        return orderService.getUser(memberId);
    }
    @GetMapping(value = "orderListByParams")
    // @GetMapping("orderlist")
    public List<OrderModel> myOrders(@RequestParam("memberId") String memberId) {
        return orderService.getUser(memberId);
    }
    @GetMapping(value = "requestThroughParams")
    // @GetMapping("orderlist")
    public List<OrderModel> myOrderList() {
        return orderService.getAllUsers();
    }
    @GetMapping(value = "requestThroughId")
    // @GetMapping("orderlist")
    public Optional<OrderModel> myOrderList(@RequestParam("transactionNumber") Long transactionNumber) {
        return orderService.gettingAParticularRecordById(transactionNumber);
    }
    @GetMapping(value = "requestById")
    public List<OrderModel> myorders(@RequestParam("transactionNumber") List<Long> transactionNumbers) {
        return orderService.getAllOrders(transactionNumbers);
    }
}
