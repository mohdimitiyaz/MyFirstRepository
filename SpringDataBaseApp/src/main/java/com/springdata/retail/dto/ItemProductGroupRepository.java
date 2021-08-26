package com.springdata.retail.dto;

import com.springdata.retail.dao.Item_Product_Group;
import com.springdata.retail.dao.Offer_MetaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository

public interface ItemProductGroupRepository extends CrudRepository<Item_Product_Group,String> {

   /* @Autowired
    EntityManager entityManager = null;*/

    /*@Query(value = "Select ipg.id, om.offerid " +
            "offer_metadata om  " +
            "inner join offer_product_group opg on  om.offerid = opg.offerid " +
            "inner join item_product_group ipg on ipg.productgroupid = ipg.productgroupid",nativeQuery = true)*/
    //@Query("SELECT * FROM Item_Product_Group ipg Inner JOIN Offer_MetaData om on ipg.productgroupid=om.productgroupid")
    @Query(value = "SELECT b, a FROM item_product_group b INNER JOIN b.author a")
    List<Item_Product_Group> findByOfferId(String offerId);


}

