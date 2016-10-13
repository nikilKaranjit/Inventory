/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.controller;

import com.project.inventory.entity.Customer;
import com.project.inventory.service.CustomerService;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Nikil
 */
@Controller
@RequestMapping(value= "/admin/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    
    @RequestMapping(method = RequestMethod.GET)
    public  @ResponseBody String index(){
        try {
            String content="";
            for(Customer c:customerService.getALL()){
                content +=c.toString();
            }
            return content;
        } catch (SQLException ex) {
          
        }
    return "Database is Empty";
    }
}
