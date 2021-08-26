package com.springdata.retail.dto;

//import com.it.basepackage.springdata.dao.Offer_MetaData;
import com.springdata.retail.dao.Offer_MetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OfferMetaDataRepository  extends CrudRepository<Offer_MetaData,String> {

    List<Offer_MetaData> findByOfferId(String offerId);

}
