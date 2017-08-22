package com.egrocery.service;

import java.util.List;

import com.egrocery.model.Customer;

public interface CustomerService {
	
    void addCustomer(Customer customer); 
	
	Customer getCustomerById(int customerId); 
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerByUsername(String userName); 
}
