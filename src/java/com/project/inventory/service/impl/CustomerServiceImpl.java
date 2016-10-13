/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.service.impl;

import com.project.inventory.entity.Customer;
import com.project.inventory.entity.DAO.CustomerDAO;
import com.project.inventory.service.CustomerService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nikil
 */
@Service(value = "CustomerService")
public class CustomerServiceImpl implements CustomerService{
     @Autowired
     private CustomerDAO customerDAO;
    @Override
    public List<Customer> getALL() throws SQLException {
        return customerDAO.getALL();
    }

    @Override
    public int insert(Customer c) throws SQLException {
       return customerDAO.insert(c);
    }

    @Override
    public int update(Customer c) throws SQLException {
        return customerDAO.update(c);
    }

    @Override
    public int delete(int customer_id) throws SQLException {
       return customerDAO.delete(customer_id);
    }

    @Override
    public Customer getById(int customer_id) throws SQLException {
         return customerDAO.getById(customer_id);
    }
    
}
