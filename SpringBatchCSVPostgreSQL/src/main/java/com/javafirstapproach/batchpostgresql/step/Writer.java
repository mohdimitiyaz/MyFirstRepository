package com.javafirstapproach.batchpostgresql.step;

import com.javafirstapproach.batchpostgresql.dao.CustomerRepository;
import com.javafirstapproach.batchpostgresql.model.Customer;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.BeanWrapperFieldExtractor;
import org.springframework.batch.item.file.transform.DelimitedLineAggregator;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Writer extends FlatFileItemWriter<Customer> {

    //private final CustomerRepository customerRepository;

    /*public Writer(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }*/

    public Writer() {
        setResource(new FileSystemResource("resources/customer-data.csv"));
        setLineAggregator(getDelimitedLineAggregator());
    }

    public DelimitedLineAggregator<Customer> getDelimitedLineAggregator() {
        BeanWrapperFieldExtractor<Customer> beanWrapperFieldExtractor = new BeanWrapperFieldExtractor<Customer>();
        beanWrapperFieldExtractor.setNames(new String[] {"id", "firstName", "lastName"});

        DelimitedLineAggregator<Customer> delimitedLineAggregator = new DelimitedLineAggregator<Customer>();
        delimitedLineAggregator.setDelimiter(",");
        delimitedLineAggregator.setFieldExtractor(beanWrapperFieldExtractor);
        return delimitedLineAggregator;

    }
}
