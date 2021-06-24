package com.it.firstapplication.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderOfferBenefit {
    private OrderOfferBenefitDiscount discount;
    private List<OrderOfferBenefitPointProgram> pointsProgram;
    private OrderOfferBenefitPrintedMessage printedMessage;

}
