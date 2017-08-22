package com.egrocery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrocery.dao.CustomerDao;
import com.egrocery.model.Customer;
import com.egrocery.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired 
	CustomerDao customerDao; 

	public void addCustomer(Customer customer) {
		 customerDao.addCustomer(customer); 
		
	}

	public Customer getCustomerById(int customerId) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerById(customerId); 
	}

	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerDao.getAllCustomers();
	}
	
	 
	public Customer getCustomerByUsername(String userName) {
		return customerDao.getCustomerByUsername(userName);
	}

}
