package com.springdata.retail.service;

//import com.it.basepackage.springdata.dao.ItemProductGroup;
//import com.it.basepackage.springdata.dao.OfferMetaData;
//import com.it.basepackage.springdata.dao.OfferProductGroup;
import com.springdata.retail.models.ItemProductGroup;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.models.OfferMetaData;
import com.springdata.retail.repositories.ItemProductGroupRepository;
//import com.springdata.retail.dto.JoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public  class RetailService {

    @Autowired
    ItemProductGroupRepository itemProductGroupRepository;
    @Autowired
    OfferMetaData offerMetaData;


    public Optional<ItemProductGroup> getItems(String offerId) {
        Optional<ItemProductGroup> itemProductGroups = itemProductGroupRepository.findById(offerId);
        return itemProductGroups;
    }
}
