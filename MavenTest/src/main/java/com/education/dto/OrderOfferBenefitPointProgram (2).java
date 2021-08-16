package com.education.dto;

import lombok.Data;

import java.util.List;
@Data
public class OrderOfferBenefitPointProgram {
    private String pointsGroupName;
    private Integer pointsLimit;
    private List<OrderOfferBenefitPointProgramTier> tiers;
    private OrderOfferBenefitPointProgramScoreCard scoreCard;

}

