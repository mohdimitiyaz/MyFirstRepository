package com.education.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class OrderItem {
    private String itemCode;
    private Integer entryId;
    private Integer department;
    private double unitPrice;
    private double extendedPrice;
    private Integer clubCardSaving;
    private String quantityType;
    private Double quantityValue;
    private boolean discountAllowed;
    private boolean pointsApplyItem;
    private Integer departmentGroupNumber;
    private boolean wic;
    private List<OrderItemExternalSaving> externalSavings;
    private String linkPluNumber;
    private String itemPluNumber;
    private Date startDate;
    private Date endDate;

}
