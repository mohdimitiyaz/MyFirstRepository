package com.education.dto;

import lombok.Data;

import java.util.List;
@Data
public class OrderOfferConditionPointProgram {
    private String pointsGroupName;
    private List<OrderOfferConditionPointProgramTier> tiers;
}
