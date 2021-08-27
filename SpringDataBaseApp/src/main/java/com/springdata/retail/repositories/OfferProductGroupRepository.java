package com.springdata.retail.repositories;


//import com.springdata.retail.dao.OfferMetaData;
//import com.springdata.retail.dao.OfferProductGroup;
//import com.springdata.retail.dao.JoinTables;
import com.springdata.retail.models.OfferProductGroup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferProductGroupRepository extends CrudRepository<OfferProductGroup,String> {

    List<OfferProductGroup> findByOfferId(String id);
}
