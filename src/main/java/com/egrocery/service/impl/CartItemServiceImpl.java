package com.egrocery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egrocery.dao.CartItemDao;
import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;
import com.egrocery.service.CartItemService;
 
@Service
public class CartItemServiceImpl implements CartItemService {

	@Autowired 
	CartItemDao cartItemDao;
	 

	public void addCartItem(CartItem cartItem) {
		cartItemDao.addCartItem(cartItem); 
		
	}

	public void removeCartItem(CartItem cartItem) {
		cartItemDao.removeCartItem(cartItem); 
		
	}

	public void removeAllCartItems(Cart cart) {
		
		cartItemDao.removeAllCartItems(cart); 
	}

	public CartItem getCartItemByProductId(int productId, int cartId) {
		 
		return cartItemDao.getCartItemByProductId(productId, cartId);
	}

}
