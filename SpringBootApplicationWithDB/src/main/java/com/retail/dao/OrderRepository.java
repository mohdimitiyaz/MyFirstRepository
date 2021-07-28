package com.retail.dao;

import com.retail.dto.OrderModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<OrderModel,Long> {
    List<OrderModel> findByMemberId(String memberId);
}