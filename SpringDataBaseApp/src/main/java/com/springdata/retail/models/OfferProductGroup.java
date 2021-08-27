package com.springdata.retail.models;
//package com.springdata.retail.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Data
@Entity
@Table(name = "offer_product_group")
@AllArgsConstructor
@NoArgsConstructor
public class OfferProductGroup implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id//(name = "transactionnumber")
    //@SequenceGenerator(name="mySeqGen",sequenceName = "offerproductgroupSeq",initialValue = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mySeqGen")
    private String productGroupId;
    @Column(name = "offerid")
    private String offerId;
    @Column(name = "extofferid")
    private String extOfferid;
    @Column(name = "condition")
    private String condition;
    @Column(name = "benefit")
    private String benefit;
    @Column(name = "indicator")
    private String indicator;
    @Column(name = "startdate")
    private Date startDate;
    @Column(name = "enddate")
    private Date endDate;
    @Column(name = "recorddate")
    private Date recordDate;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "lastupdateddate")
    private Date lastUpDatedDate;

    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="productgroupid")
    private OfferProductGroup offerProductGroup;

}
