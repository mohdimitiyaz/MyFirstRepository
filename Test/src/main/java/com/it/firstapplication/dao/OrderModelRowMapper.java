package com.it.firstapplication.dao;

import com.it.firstapplication.dao.model.OrderModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/*
public class OrderModelRowMapper implements RowMapper<OrderModel> {

    @Override
    public OrderModel mapRow(ResultSet rs, int arg1) throws SQLException {
       OrderModel orderModel = new OrderModel();
        orderModel.setTransactionNumber(rs.getString("transactionnumber"));
        orderModel.setMemberId(rs.getString("memberid"));
        orderModel.setStoreNumber(rs.getString("storenumber"));
        orderModel.setTerminalNumber(rs.getString("terminalnumber"));
        return orderModel;
    }
}
*/
