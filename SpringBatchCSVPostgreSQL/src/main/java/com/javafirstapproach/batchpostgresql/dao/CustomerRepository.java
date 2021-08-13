package com.javafirstapproach.batchpostgresql.dao;

import com.javafirstapproach.batchpostgresql.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByFirstName(String firstname);

}
