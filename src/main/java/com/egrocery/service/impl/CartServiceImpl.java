package com.egrocery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrocery.dao.CartDao;
import com.egrocery.model.Cart;
import com.egrocery.service.CartService;

@Service
public class CartServiceImpl implements CartService {
		
	@Autowired 
	CartDao cartDao; 

	public Cart getCartById(int cartId) {
		 
		return cartDao.getCartById(cartId);
	}

	public void update(Cart cart) {

		cartDao.update(cart);

	}

}
