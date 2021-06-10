package com.ecom.util;

import com.ecom.dto.Order;

import java.util.Comparator;

public class OrderWithStartDate implements Comparator<Order> {
    @Override
    public int compare(Order order1, Order order2) {
        return order1.getStartDate().compareTo(order2.getStartDate());
    }
}
