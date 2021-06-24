package com.it.firstapplication.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class OrderRequest {
    private String offerId;
    private String itemCode;
}
