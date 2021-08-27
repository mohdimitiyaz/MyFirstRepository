package com.springdata.retail.repositories;

//import com.it.basepackage.springdata.dao.OfferMetaData;
import com.springdata.retail.models.OfferMetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferMetaDataRepository  extends CrudRepository<OfferMetaData,String> {

    List<OfferMetaData> findByOfferId(String offerId);

}
