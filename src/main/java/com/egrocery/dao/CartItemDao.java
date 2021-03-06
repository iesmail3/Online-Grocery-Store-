package com.egrocery.dao;

import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;

public interface CartItemDao {

	void addCartItem(CartItem cartItem); 
	
	void removeCartItem(CartItem cartItem); 
	
	void removeAllCartItems(Cart cart); 
	
	CartItem getCartItemByProductId(int productId, int cartId);
}
