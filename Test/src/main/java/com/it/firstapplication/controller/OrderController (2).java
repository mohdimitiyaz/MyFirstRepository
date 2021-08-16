package com.it.firstapplication.controller;


import com.it.firstapplication.dto.Order;
import com.it.firstapplication.dto.OrderLookUp;
import com.it.firstapplication.dto.OrderOffer;
import com.it.firstapplication.dto.OrderRequest;
import com.it.firstapplication.service.OrderService;
import com.it.firstapplication.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    @Resource
    @Autowired

    TestService testService;




   /* @PostMapping(value = "/createEmp")
    public void createEmployee(@RequestBody Employee emp) {
        employeeService.insertEmployee(emp);

    }
    @PutMapping(value = "/updateEmp")
    public void updateEmployee(@RequestBody Employee emp) {
        employeeService.updateEmployee(emp);

    }
    @PutMapping(value = "/executeUpdateEmp")
    public void executeUpdateEmployee(@RequestBody Employee emp) {
        employeeService.executeUpdateEmployee(emp);

    }

    @DeleteMapping(value = "/deleteEmpById")
    public void deleteEmployee(@RequestBody Employee emp) {
        employeeService.deleteEmployee(emp);

    }*/


    Logger log = LoggerFactory.getLogger(OrderController.class);

    //TestService testService;

    @GetMapping("service")
    public Integer myService() {
        // log.debug -- debug msg
        // log.info -- info msg
        return 1;
    }

    @GetMapping("services")
    public String secondService() {
        return "You brother";
    }

    @GetMapping("orders")
    public Order myOrder() {
        return testService.getOrders();
    }

    @GetMapping("orderoffer")
    public List<OrderOffer> myOrderOffer() {
        return testService.getOrderOffer();
    }

    @GetMapping("orderlookup")
    public List<OrderLookUp> myOrderLookUp() {
        return testService.getOrderLookUp();
    }

    @RequestMapping(value = "orderlist", method = RequestMethod.GET, produces = {"application/json", "application/xml"})
    // @GetMapping("orderlist")
    public List<Order> myOrders(@RequestParam("orderId") String orderId, @RequestParam("itemCode") String itemCode) {
        return testService.fetchOrdersByOrderId(orderId, itemCode);
    }

    @GetMapping("listoforder/{orderId}/{itemCode}")
    //@ResponseBody
    public List<Order> myOrderList(@PathVariable(value = "itemCode") String itemCode, @PathVariable(value = "orderId") String orderId) {
        return testService.fetchOrdersByOrderId(orderId, itemCode);
    }

    @GetMapping("ordersByHeader")
    public List<Order> ordersByHeader(@RequestHeader String itemCode, @RequestHeader String orderId) {
        return testService.fetchOrdersByOrderId(orderId, itemCode);
    }

    @RequestMapping(value = "ordersByPost", method = RequestMethod.POST, produces = {"application/json", "application/xml"})
    //@PostMapping("ordersByPost")
    public List<Order> postOrders(@RequestBody OrderRequest orderRequest) {
        return testService.fetchOrdersByOrderId(orderRequest.getOfferId(), orderRequest.getItemCode());
    }

    @PutMapping("ordersByPut")
    public List<Order> putOrders(@RequestBody OrderRequest orderRequest) {
        log.error("I am error level message");
        log.debug("I am debug level message");
        log.trace("I am trace level message");
        log.info("I am info level message");
        return testService.fetchOrdersByOrderId(orderRequest.getOfferId(), orderRequest.getItemCode());
    }
}



