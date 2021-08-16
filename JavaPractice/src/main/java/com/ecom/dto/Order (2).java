package com.ecom.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public   class Order {

    private Integer orderId;
    private Date startDate;
    private Date endDate;
    private List<Item> items;
    private List<Shipment>  shipments;

//    @Override
//    public String toString(){
//        return orderId.toString();
//    }
}
