package com.it.firstapplication.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderOfferBenefitDiscount {
    private String discountLevel;
    private List<OrderOfferBenefitDiscountDiscountProduct> discountProducts;
    private List<OrderOfferBenefitDiscountSpecialPricing> specialPricing;
    private OrderOfferBenefitDiscountScoreCard scoreCard;
}
