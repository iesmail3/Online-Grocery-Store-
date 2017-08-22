package com.egrocery.dao.impl;

 

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
import com.egrocery.dao.CartItemDao;
import com.egrocery.model.Cart;
import com.egrocery.model.CartItem;
import com.egrocery.service.CartItemService;
import com.egrocery.service.CartService;

@Repository
@Transactional 
public class CartItemDaoImpl implements CartItemDao {

	@Autowired 
	SessionFactory sessionFactory; 
	@Autowired 
	CartItemService cartItemService; 
	@Autowired 
	CartService cartService; 
	
	public void addCartItem(CartItem cartItem) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(cartItem);
		session.flush(); 
	}

	public void removeCartItem(CartItem cartItem) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(cartItem);
		session.flush();
	}

	public void removeAllCartItems(Cart cart) {
		List<CartItem> cartItems = cart.getCartItems(); 
		
		for(CartItem item: cartItems) 
		{ 
			removeCartItem(item); 
		}

	}

	public CartItem getCartItemByProductId(int productId, int cartId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from CartItem where productId = ? and cartId = ?"); 
		query.setInteger(0, productId); 
		query.setInteger(1, cartId);
		session.flush();
		return (CartItem) query.uniqueResult(); 
	}
}
