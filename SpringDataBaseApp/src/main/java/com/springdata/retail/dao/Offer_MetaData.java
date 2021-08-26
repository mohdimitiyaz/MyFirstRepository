package com.springdata.retail.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.awt.geom.Area;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "offer_metadata")
@AllArgsConstructor
@NoArgsConstructor
public class Offer_MetaData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id//(name = "transactionnumber")
    //@SequenceGenerator(name="mySeqGen",sequenceName = "offermetadataSeq",initialValue = 2)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "mySeqGen")
    private String offerId;
    @Column(name = "extofferid")
    private String extOfferId;
    @Column(name = "status")
    private String status;
    @Column(name = "source")
    private String source;
    @Column(name = "category")
    private String category;
    @Column(name = "customercondition")
    private String customerCondition;
    @Column(name = "terminaltypes")
    private String terminalTypes;
    @Column(name = "payload")
    private String payLoad;
    @Column(name = "deleted")
    private Boolean deleted;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "offer_product_group", orphanRemoval = true)
    private List<Offer_Product_Group> offerProductGroups = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item_product_group", orphanRemoval = true)
    private List<Item_Product_Group> item_product_groups = new ArrayList<>();
    //private List<Offer_MetaData> offer_metaData;



    /*@OneToMany
    private List<Offer_Product_Group> offer_product_group;

    @OneToMany
    private List<Item_Product_Group> item_product_groups;*/

    /*@OneToMany(targetEntity = Offer_Product_Group.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<Offer_Product_Group> offerProductGroups;*/


}
