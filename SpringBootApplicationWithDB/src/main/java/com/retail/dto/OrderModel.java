package com.retail.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "orderTable")
@AllArgsConstructor
@NoArgsConstructor
public class OrderModel {
    public OrderModel(Long transactionNumber){

    }

    @Id//(name = "transactionnumber")
    @SequenceGenerator(name="mySeqGen",sequenceName = "orderTableSeq",initialValue = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mySeqGen")
    private Long transactionNumber;
    @Column(name = "memberid")
    private String memberId;
    @Column(name = "storenumber")
    private String storeNumber;
    @Column(name = "terminalnumber")
    private String terminalNumber;
}
