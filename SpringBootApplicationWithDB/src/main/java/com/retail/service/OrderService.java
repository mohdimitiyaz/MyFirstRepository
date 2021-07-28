package com.retail.service;

import com.retail.dao.OrderRepository;
import com.retail.dto.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.criteria.Order;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<OrderModel> bulkCreate() {
// save a single Customer
        //List<OrderModel> orderModels = new ArrayList<>();
       /* OrderModel orderModel = new OrderModel(1L, "55555", "6566655", "02564");
        OrderModel saveOrderModel = repository.save(orderModel);
        orderModels.add(saveOrderModel);*/
// save a list of Customers
        List<OrderModel> orderModels = (List<OrderModel>) repository.saveAll(Arrays.asList(new OrderModel(2L, "52525", "3333", "22222")
                , new OrderModel(3L, "52525", "3333", "22222")
                , new OrderModel(4L, "52526", "3334", "72222")
                , new OrderModel(5L, "52525", "3333", "22222")));
        return orderModels;
    }

    public List<OrderModel> create(List<OrderModel> orderModels) {
// save a single Customer
        List<OrderModel> saveOrderModels = new ArrayList<>();
        for (OrderModel orderModel : orderModels) {
            OrderModel saveOrderModel = repository.save(new OrderModel(orderModel.getTransactionNumber(), orderModel.getMemberId(), orderModel.getStoreNumber(), orderModel.getTerminalNumber()));
            saveOrderModels.add(saveOrderModel);
        }
//        saveOrderModels.addAll((List<OrderModel>)repository.saveAll(orderModels));
        //OrderModel ordermodel = repository.save(saveOrderModel);

        return saveOrderModels;
    }

    /*public List<OrderModel> getOrderModelThroughQuery() {
        List<OrderModel> saveOrderModels = new ArrayList<>();
        for (OrderModel orderModel : orderModels) {
            OrderModel saveOrderModel = repository.findByMemberId(orderModel.getMemberId());
            saveOrderModels.add(saveOrderModel);
        }
        return saveOrderModels;
//        saveO
    }*/
    //Fetching a particular record using request params.
    public List<OrderModel> getUser(String memberId) {
        List<OrderModel> orderModels = repository.findByMemberId(memberId);
        return orderModels;
    }

    //fetching all data using findall method.
    public List<OrderModel> getAllUsers() {
        List<OrderModel> orderModelList = (List<OrderModel>) repository.findAll();
        return orderModelList;
    }

    public Optional<OrderModel> gettingAParticularRecordById(Long transactionNumber) {
        Optional<OrderModel> orderModelList = repository.findById(transactionNumber);
        return orderModelList;
    }
    public static Long  getTransactionNumber(){
       return 2L;
    }
    public List<OrderModel> getAllOrders(List<Long> ids) {
        ids.add(2L);
        List<OrderModel> orderModels = (List<OrderModel>)repository.findAllById(ids);

        return orderModels;
    }
}
    /* List<Order> orderByItemCode = processedOrders.stream().filter(order -> {
                return order.getItems().stream().anyMatch(orderItem -> orderItem.getItemCode().equals(code));
            }).collect(Collectors.toList());*/

