package com.ecom.util;

import com.ecom.dto.Order;

import java.util.Comparator;

public class OrderWithEndDate implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getEndDate().compareTo(order2.getEndDate());
    }

}
