package com.springdata.retail.service;

//import com.it.basepackage.springdata.dao.Item_Product_Group;
//import com.it.basepackage.springdata.dao.Offer_MetaData;
//import com.it.basepackage.springdata.dao.Offer_Product_Group;
import com.springdata.retail.dao.Item_Product_Group;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.dto.ItemProductGroupRepository;
//import com.springdata.retail.dto.JoinRepository;
import com.springdata.retail.dto.OfferMetaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Component
@Service
public  class RetailService {

    @Autowired
    ItemProductGroupRepository itemProductGroupRepository;


    public List<Item_Product_Group> innerJoinData() {
        return itemProductGroupRepository.findByOfferId("100");
    }
}
