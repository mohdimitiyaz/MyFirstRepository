package com.education.dto;

import lombok.Data;

@Data
public class OrderOfferBenefitDiscountDiscountProductTier {
    private double discountValue;
    private double dollarLimit;
    private Integer itemLimit;
    private String receiptText;
    private Integer weightLimit;
}
