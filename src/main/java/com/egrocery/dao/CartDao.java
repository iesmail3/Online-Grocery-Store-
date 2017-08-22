package com.egrocery.dao;

import java.io.IOException;
import java.util.List;

import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;

public interface CartDao {

  Cart getCartById(int cartId); 
  void update(Cart cart); 
  Cart validate(int cartId) throws IOException; 
}
