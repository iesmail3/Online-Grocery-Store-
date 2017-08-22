package com.egrocery.service;

import com.egrocery.model.CustomerOrder;

public interface CustomerOrderService {
	
	void addCustomerOrder(CustomerOrder customerOrder); 
	
	double getCustomerOrderGrandTotal(int cartId); 
	

}
