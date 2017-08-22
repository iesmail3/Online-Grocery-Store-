package com.egrocery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrocery.dao.CustomerOrderDao;
import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;
import com.egrocery.model.CustomerOrder;
import com.egrocery.service.CartService;
import com.egrocery.service.CustomerOrderService;

@Service
public class CustomerorderServiceImpl implements CustomerOrderService {
	
	@Autowired 
	CustomerOrderDao customerOrderDao; 
	
	@Autowired 
	CartService cartService; 

	public void addCustomerOrder(CustomerOrder customerOrder) {
	 
		customerOrderDao.addCustomerOrder(customerOrder); 

	}

	public double getCustomerOrderGrandTotal(int cartId) {
		double grandTotal = 0; 
		
		Cart cart = cartService.getCartById(cartId); 
		
		List<CartItem> cartItems = cart.getCartItems(); 
		
		for(CartItem item : cartItems) 
		{ 
			grandTotal += item.getTotalPrice(); 
		}
		 
		return grandTotal;
	}

}
