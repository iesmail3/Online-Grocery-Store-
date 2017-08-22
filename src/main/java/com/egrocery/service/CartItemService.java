package com.egrocery.service;

import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem); 
	
	void removeCartItem(CartItem cartItem); 
	
	void removeAllCartItems(Cart cart); 
	
	CartItem getCartItemByProductId(int productId, int cartId); 
}
