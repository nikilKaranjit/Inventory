/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.constant;

/**
 *
 * @author Nikil
 */
public class SQLConstant {
    public final static String CUSTOMER_GETALL= " SELECT * FROM " + TableConstant.TABLE_CUSTOMER;
    public final static String CUSTOMER_INSERT= " INSERT INTO " + TableConstant.TABLE_CUSTOMER 
    + "(customer_id,first_name,last_name,contact_number,address,email,product_id,added_date,modified_date)"
    + " VALUES (?,?,?,?,?,?,?,?,?) ";
    public final static String CUSTOMER_UPDATE= " UPDATE " + TableConstant.TABLE_CUSTOMER + " SET first_name=?,last_name=?,"
            + "contact_number=?,address=?,email=?,product_id=?,added_date=?,modified_date=? "
            + " WHERE customer_id=? ";
    public final static String CUSTOMER_DELETE=  " DELETE  FROM " + TableConstant.TABLE_CUSTOMER  + " WHERE customer_id=?";
    public final static String CUSTOMER_GETBYID= " SELECT * FROM " + TableConstant.TABLE_CUSTOMER  + " WHERE customer_id = ? " ;
}
