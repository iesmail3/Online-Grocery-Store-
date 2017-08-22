package com.egrocery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.egrocery.model.Cart;
import com.egrocery.model.Customer;
import com.egrocery.model.CustomerOrder;
import com.egrocery.service.CartService;
import com.egrocery.service.CustomerOrderService;

@Controller 
public class OrderController {
	
	@Autowired 
	private CartService cartService; 
	
	@Autowired 
	private CustomerOrderService customerOrderService; 
	

    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart=cartService.getCartById(cartId);
        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        customerOrder.setBillingAddress(customer.getBillingAddress());
        customerOrder.setShippingAddress(customer.getShippingAddress());

        customerOrderService.addCustomerOrder(customerOrder);

        return "redirect:/checkout?cartId="+cartId;
    }

}
