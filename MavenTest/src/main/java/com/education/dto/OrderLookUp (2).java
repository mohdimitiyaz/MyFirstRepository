package com.education.dto;

import lombok.Data;

@Data
public class OrderLookUp {
    private String id;
    private String  type;
    private String condition;
    private String benefit;
    private Integer offerId;
    private String indicator;
}
