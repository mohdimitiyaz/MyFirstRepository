package com.it.firstapplication.dto;

import lombok.Data;

@Data
public class OrderItemExternalSaving {
    private double extendedPrice;
    private String quantityType;
    private double quantityValue;
    private Integer adjustmentType;
    private Integer promotionCode;

}
