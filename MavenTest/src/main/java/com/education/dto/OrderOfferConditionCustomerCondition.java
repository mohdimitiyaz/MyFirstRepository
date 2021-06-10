package com.education.dto;

import lombok.Data;

import java.util.List;
@Data
public class OrderOfferConditionCustomerCondition {
    private List<OrderOfferConditionCustomerConditionExclude> exclude;
    private List<OrderOfferConditionCustomerConditionInclude> include;
}

