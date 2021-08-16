package com.it.firstapplication.dao.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "order")
@AllArgsConstructor
public class OrderModel {

    @Column(name = "transactionnumber")
    private String transactionNumber;
    @Column(name = "memberid")
    private String memberId;
    @Column(name = "storenumber")
    private String storeNumber;
    @Column(name = "terminalnumber")
    private String terminalNumber;
   /* public OrderModel(String transactionNumber,String memberId, String storeNumber, String terminalNumber){
        this.transactionNumber = transactionNumber;
        this.memberId = memberId;
        this.storeNumber = storeNumber;
        this.terminalNumber = terminalNumber;*/
    }


