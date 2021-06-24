package com.it.firstapplication.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderOfferConditionPointProgram {
    private String pointsGroupName;
    private List<OrderOfferConditionPointProgramTier> tiers;
}
