package com.egrocery.dao;

import java.io.IOException;
import java.util.List;

import com.egrocery.model.Cart;
import com.egrocery.model.Customer;

public interface CustomerDao {
	
void addCustomer(Customer customer); 
	
	Customer getCustomerById(int customerId); 
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerByUsername(String userName); 
	
}
