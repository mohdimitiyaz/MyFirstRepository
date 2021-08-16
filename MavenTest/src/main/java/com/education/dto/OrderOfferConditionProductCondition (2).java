package com.education.dto;

import lombok.Data;

import java.util.List;
@Data
public class OrderOfferConditionProductCondition {
    private String productGroupName;
    private String excGroupName;
    private Integer minProductQuantity;
    private Integer minPurchaseAmount;
    private String productConditionOperator;
    private String productConditionType;
    private List<OrderOfferConditionProductConditionTier> tiers;
    private boolean uniqueProductCondition;

}

