package com.springdata.retail.dao;
//package com.springdata.retail.dao;

import com.springdata.retail.dao.Offer_MetaData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "offer_product_group")
@AllArgsConstructor
@NoArgsConstructor
public class Offer_Product_Group implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "item_product_group", orphanRemoval = true)
    private List<Item_Product_Group> item_product_groups = new ArrayList<>();
    //@OneToMany(fetch = FetchType.LAZY)
   // @Column(name = "offerId")
    private Offer_Product_Group offer_product_group;

    /*@OneToMany
    private List<Item_Product_Group> item_product_groups;*/

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "offerId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Offer_MetaData offer_metaData;*/


}
