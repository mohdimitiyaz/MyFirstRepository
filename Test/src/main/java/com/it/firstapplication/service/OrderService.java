package com.it.firstapplication.service;

import com.it.firstapplication.dao.OrderDao;
//import com.it.firstapplication.dao.OrderModelRowMapper;
import com.it.firstapplication.dao.OrderRepository;
import com.it.firstapplication.dao.model.OrderModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Component
public class OrderService implements OrderDao {
    public OrderService() {
    }


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public OrderService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

   // JdbcTemplate jdbcTemplates;

    /*public List<OrderModel> findAll() {
        return jdbcTemplate.query("SELECT * FROM \"order\"", new OrderModelRowMapper());
        //return template.query("select * from order", new OrderModelRowMapper());
    }*/


    @Override
    public List<OrderModel> findAll() {
        return null;
    }

    public void insertOrder(OrderModel orderModel) {
//        final String sql = "insert into \"order\"(transactionnumber, memberid , storenumber,terminalnumber) values(:transactionnumber,:memberid,:storenumber,:terminalnumber)";
        final String sql = "insert into \"order\"(transactionnumber, memberid , storenumber,terminalnumber) values(?,?,?,?)";

        //        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("transactionnumber", orderModel.getTransactionNumber())
                .addValue("memberid", orderModel.getMemberId())
                .addValue("storenumber", orderModel.getStoreNumber())
                .addValue("terminalnumber", orderModel.getTerminalNumber());
//        jdbcTemplate.update(sql, param);,
        jdbcTemplate.update(sql, orderModel.getTransactionNumber(), orderModel.getMemberId(), orderModel.getStoreNumber(), orderModel.getTerminalNumber() );
    }

    public void updateOrder(OrderModel order) {
        final String sql = "update order set transactionnumber=:transactionnumber, memberid=:memberid, storenumber=:storenumber where terminalNumber=:terminalNumber";
        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("transactionnumber", order.getTransactionNumber())
                .addValue("memberid", order.getMemberId())
                .addValue("storenumber", order.getStoreNumber())
                .addValue("terminalnumber", order.getTerminalNumber());
        jdbcTemplate.update(sql, param, holder);
    }

    public void executeUpdateOrder(OrderModel order) {
        final String sql = "update order set transactionnumber=:transactionnumber, memberid=:memberid, storenumber=:storenumber where terminalnumber=:terminalnumber";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("transactionnumber", order.getTransactionNumber());
        map.put("memberid", order.getMemberId());
        map.put("storenumber", order.getStoreNumber());
        map.put("terminalnumber", order.getTerminalNumber());
        /*jdbcTemplate.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });*/
    }

    public void deleteOrder(OrderModel order) {
        final String sql = "delete from employee where transactionnumber=:transactionnumber";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("transactionnumber", order.getTransactionNumber());
        /*jdbcTemplate.execute(sql, map, new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });*/
    }
}
