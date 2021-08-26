package com.springdata.retail.dto;


//import com.springdata.retail.dao.Offer_MetaData;
//import com.springdata.retail.dao.Offer_Product_Group;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.dao.Item_Product_Group;
import com.springdata.retail.dao.Offer_MetaData;
import com.springdata.retail.dao.Offer_Product_Group;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferProductGroupRepository extends CrudRepository<Offer_Product_Group,String> {

    List<Offer_Product_Group> findByOfferId(String id);
}
