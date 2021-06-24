package com.it.firstapplication.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderOffer {
    private String source;
    private Integer offerId;
    private String offerExternalId;
    private Integer linkPLUNumber;
    private String category;
    private Date offerStartDate;
    private Date offerEndDate;
    private String offerDescription;
    private String offerName;
    private String offerPriority;
    private Date offerTestingStartDate;
    private Date offerTestingEndDate;
    private boolean deferEndOfSaleIndicator;
    private OrderOfferOfferLimit offerLimit;
    private OrderOfferBenefit benefit;
    private OrderOfferCondition conditions;
    private String programCode;

}
