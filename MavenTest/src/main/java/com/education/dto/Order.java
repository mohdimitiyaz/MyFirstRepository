package com.education.dto;

import lombok.Data;

import java.util.List;

//	ignore null fields , class level

@Data
public class Order {

    private String transactionNumber;
    private String memberId;
    private String storeNumber;
    private String terminalNumber;
    private List<OrderTender> tender;
    private List<OrderItem> items;
    private List<OrderUsage> usages;
    private List<OrderOffer> offers;
    private List<OrderLookUp> lookUps;
    private List<OrderPoint> points;
    private List<OrderRewardScoreCard> rewardScoreCards;
}



//private List<OrderItem> items;
//private List<Shipment>  shipments;

//    @Override
//    public String toString(){
//        return orderId.toString();
//    }

