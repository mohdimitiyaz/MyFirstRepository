package com.springdata.retail.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "item_product_group")
@AllArgsConstructor
@NoArgsConstructor
public class ItemProductGroup implements Serializable {

    @Id//(name = "transactionnumber")
    @SequenceGenerator(name="mySeqGen",sequenceName = "itemproductgroupSeq",initialValue = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mySeqGen")
    private String id;
    @Column(name = "type")
    private String type;
    @Column(name = "productgroupid")
    private String productGroupId;
    @Column(name = "recorddate")
    private Date recordDate;
    @Column(name = "createddate")
    private Date createdDate;
    @Column(name = "lastupdateddate")
    private Date lastUpDatedDate;
    @OneToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinColumn(name="productgroupid")
    private OfferProductGroup offerProductGroup;




/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productGroupId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private OfferProductGroup offer_product_group;*/

    /*@OneToMany(targetEntity = OfferProductGroup.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<OfferProductGroup> offerProductGroups;*/
}
