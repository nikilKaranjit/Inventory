/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.inventory.entity;

/**
 *
 * @author Nikil
 */
public class Customer {
    private int customer_id;
    private String first_name;
    private String last_name;
    private int contact_number;
    private String address;
    private String email;
    private int product_id;
    private String added_date;
    private String modified_date;

    public Customer() {
    }

    public Customer(int customer_id, String first_name, String last_name, int contact_number, String address, String email, int product_id, String added_date, String modified_date) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.contact_number = contact_number;
        this.address = address;
        this.email = email;
        this.product_id = product_id;
        this.added_date = added_date;
        this.modified_date = modified_date;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getContact_number() {
        return contact_number;
    }

    public void setContact_number(int contact_number) {
        this.contact_number = contact_number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getAdded_date() {
        return added_date;
    }

    public void setAdded_date(String added_date) {
        this.added_date = added_date;
    }

    public String getModified_date() {
        return modified_date;
    }

    public void setModified_date(String modified_date) {
        this.modified_date = modified_date;
    }

    @Override
    public String toString() {
        return "Customer{" + "customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name + ", contact_number=" + contact_number + ", address=" + address + ", email=" + email + ", product_id=" + product_id + ", added_date=" + added_date + ", modified_date=" + modified_date + '}';
    }
    
}
