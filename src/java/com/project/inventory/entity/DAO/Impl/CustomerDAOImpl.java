/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.entity.DAO.Impl;

import com.project.inventory.constant.SQLConstant;
import com.project.inventory.entity.Customer;
import com.project.inventory.entity.DAO.CustomerDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nikil
 */
@Repository(value = "CustomerDAO")
public class CustomerDAOImpl  implements CustomerDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    
    @Override
    public List<Customer> getALL() throws SQLException {
        return jdbcTemplate.query(SQLConstant.CUSTOMER_GETALL,new RowMapper<Customer>() {

            @Override
            public Customer mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }

    @Override
    public int insert(Customer c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CUSTOMER_INSERT,new Object[]{c.getCustomer_id(),
       c.getFirst_name(),c.getLast_name(),c.getContact_number(),c.getAddress(),
       c.getEmail(),c.getProduct_id(),c.getAdded_date(),c.getModified_date()});
    }
    private Customer mapData(ResultSet rs) throws SQLException{
      Customer c= new Customer();
      c.setCustomer_id(rs.getInt("customer_id"));
      c.setFirst_name(rs.getString("first_name"));
      c.setLast_name(rs.getString("last_name"));
      c.setContact_number(rs.getInt("contact_number"));
      c.setAddress(rs.getString("address"));
      c.setEmail(rs.getString("email"));
      c.setProduct_id(rs.getInt("product_id"));
      c.setAdded_date(rs.getString("added_date"));
      c.setModified_date(rs.getString("modified_date"));
      return c;
    
    }

    @Override
    public int update(Customer c) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CUSTOMER_UPDATE, new Object[]{c.getFirst_name(),c.getLast_name(),
          c.getContact_number(),c.getAddress(),c.getEmail(),c.getProduct_id(),c.getAdded_date()
              ,c.getModified_date(),c.getCustomer_id()});
    }

    @Override
    public int delete(int customer_id) throws SQLException {
        return jdbcTemplate.update(SQLConstant.CUSTOMER_DELETE, new Object[]{customer_id});
    }

    @Override
    public Customer getById(int customer_id) throws SQLException {
        return (Customer) jdbcTemplate.query(SQLConstant.CUSTOMER_GETBYID, new Object[]{customer_id} ,new ResultSetExtractor<Customer>() {

            @Override
            public Customer extractData(ResultSet rs) throws SQLException, DataAccessException {
               Customer c= null;
             if(rs.next()){
             c= new Customer();
             c.setCustomer_id(rs.getInt("customer_id"));
             c.setFirst_name(rs.getString("first_name"));
             c.setLast_name(rs.getString("last_name"));
             c.setContact_number(rs.getInt("contact_number"));
             c.setAddress(rs.getString("address"));
             c.setEmail(rs.getString("email"));
             c.setProduct_id(rs.getInt("product_id"));
             c.setAdded_date(rs.getString("added_date"));
             c.setModified_date(rs.getString("modified_date"));
             
             }
             return c;
          }
      });
                
            }

    }
    

