/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.service;

import com.project.inventory.entity.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nikil
 */
public interface CustomerService {
      List<Customer> getALL() throws SQLException;
    int insert (Customer c) throws SQLException;
    int update (Customer c) throws SQLException;
    int delete (int customer_id) throws SQLException;
    Customer getById (int customer_id) throws SQLException; 
}
