package com.javafirstapproach.batchpostgresql.config;

import com.javafirstapproach.batchpostgresql.dao.CustomerRepository;
import com.javafirstapproach.batchpostgresql.model.Customer;
import com.javafirstapproach.batchpostgresql.step.Processor;
import com.javafirstapproach.batchpostgresql.step.Reader;
import com.javafirstapproach.batchpostgresql.step.Writer;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    /*@Autowired
    CustomerRepository customerRepository;
*/
    @Autowired
    Reader reader;

    @Autowired
    Writer writer;

    /*@Bean
    public ItemReader<Customer> itemReader(DataSource dataSource) {


    }*/

    /*@Autowired
    DataSource dataSource;
*/

    @Bean
    public Job sampleJob() {
        return jobBuilderFactory.get("sampleJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();

    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1").<Customer, Customer>chunk(2)
                .reader(reader)
                .writer(writer).build();
    }
}
