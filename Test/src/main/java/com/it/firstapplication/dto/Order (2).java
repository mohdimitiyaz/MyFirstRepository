package com.it.firstapplication.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private List<com.it.firstapplication.dto.OrderUsage> usages;
    private List<com.it.firstapplication.dto.OrderOffer> offers;
    private List<com.it.firstapplication.dto.OrderLookUp> lookUps;
    private List<com.it.firstapplication.dto.OrderPoint> points;
    private List<com.it.firstapplication.dto.OrderRewardScoreCard> rewardScoreCards;
    }



//private List<OrderItem> items;
//private List<Shipment>  shipments;

//    @Override
//    public String toString(){
//        return orderId.toString();
//    }

