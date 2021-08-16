package com.education.dto;

import lombok.Data;

import java.util.List;
@Data
public class OrderOfferBenefitDiscountDiscountProduct {
    private boolean allowNegative;
    private double couponFactor;
    private String discountType;
    private String excGroupName;
    private boolean flexNegative;
    private String productGroupName;
    private List<OrderOfferBenefitDiscountDiscountProductTier> tiers;

}
