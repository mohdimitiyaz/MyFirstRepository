package com.it.firstapplication.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderOfferCondition {
    private String conditionJoinOperator;
    private OrderOfferConditionCustomerCondition  customerCondition;
    private OrderOfferConditionDayCondition dayCondition;
    private OrderOfferConditionPointProgram pointsProgram;
    private List<OrderOfferConditionProductCondition> productConditions;
    private List<OrderOfferConditionTimeCondition> timeConditions;
    private List<String> triggerConditions;
    private String  programCode;
}




