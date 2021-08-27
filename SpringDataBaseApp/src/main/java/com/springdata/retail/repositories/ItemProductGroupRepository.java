package com.springdata.retail.repositories;

import com.springdata.retail.models.ItemProductGroup;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ItemProductGroupRepository extends CrudRepository<ItemProductGroup,String> {

   /* @Autowired
    EntityManager entityManager = null;*/

    /*@Query(value = "Select ipg.id, om.offerid " +
            "offer_metadata om  " +
            "inner join offer_product_group opg on  om.offerid = opg.offerid " +
            "inner join item_product_group ipg on ipg.productgroupid = ipg.productgroupid",nativeQuery = true)*/
    //@Query("SELECT * FROM ItemProductGroup ipg Inner JOIN OfferMetaData om on ipg.productgroupid=om.productgroupid")
    /*@Query(value = "SELECT b, a FROM item_product_group b INNER JOIN b.author a")
    List<ItemProductGroup> findByOfferId(String offerId);*/


}

