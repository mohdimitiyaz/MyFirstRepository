package com.it.firstapplication.dao;

import com.it.firstapplication.dao.model.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
//@Component
public interface OrderRepository extends CrudRepository<OrderModel,String> {
    //List<OrderModel> findAll();
}
