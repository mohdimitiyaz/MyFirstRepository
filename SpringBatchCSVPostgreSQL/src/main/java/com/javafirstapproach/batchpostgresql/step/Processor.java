package com.javafirstapproach.batchpostgresql.step;

import com.javafirstapproach.batchpostgresql.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import java.util.Random;

public class Processor implements ItemProcessor<Customer,Customer> {

    private static final Logger log = LoggerFactory.getLogger(Processor.class);

    @Override
    public Customer process(Customer customer) throws Exception {
        Random r = new Random();

        final String firstName = customer.getFirstName().toUpperCase();
        final String lastName = customer.getLastName().toUpperCase();

        final Customer fixedCustomer = new Customer();

        log.info("Converting (" + customer + ") into (" + fixedCustomer + ")");

        return fixedCustomer;
    }
}
