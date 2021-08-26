package com.springdata.retail.dao;

import com.springdata.retail.dao.Offer_Product_Group;
import com.sun.source.doctree.SerialDataTree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.awt.geom.Area;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "item_product_group")
@AllArgsConstructor
@NoArgsConstructor
public class Item_Product_Group implements Serializable {

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



    //@ManyToOne(fetch = FetchType.LAZY)
    //@Column(name = "productgroupid")

    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "offer_metaData", orphanRemoval = true)
    //private List<Item_Product_Group> item_product_groups = new ArrayList<>();
    private Offer_Product_Group offer_product_group;
    private Item_Product_Group item_product_group;



/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "productGroupId", insertable = false, updatable = false)
    @Fetch(FetchMode.JOIN)
    private Offer_Product_Group offer_product_group;*/

    /*@OneToMany(targetEntity = Offer_Product_Group.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<Offer_Product_Group> offerProductGroups;*/
}
