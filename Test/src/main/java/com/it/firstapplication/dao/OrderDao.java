package com.it.firstapplication.dao;

import com.it.firstapplication.dao.model.OrderModel;
import com.it.firstapplication.dto.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

    List<OrderModel> findAll();

    void insertOrder(OrderModel order);

    void updateOrder(OrderModel order);

    void executeUpdateOrder(OrderModel order);

    public void deleteOrder(OrderModel order);
}
