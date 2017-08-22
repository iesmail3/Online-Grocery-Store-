package com.egrocery.service;

import com.egrocery.model.Cart;

public interface CartService {


	Cart getCartById(int cartId); 
	
	void update(Cart cart); 
}
