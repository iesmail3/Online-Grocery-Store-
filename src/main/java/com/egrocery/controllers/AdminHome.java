package com.egrocery.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.egrocery.model.Customer;
import com.egrocery.model.Product;
import com.egrocery.service.CustomerService;
import com.egrocery.service.ProductService;

 

@Controller
@RequestMapping("/admin")
public class AdminHome {
	
	@Autowired 
	ProductService productService; 
	@Autowired 
	CustomerService customerService; 
	
	@RequestMapping 
	public String adminPage(){ 
		return "admin"; 
	}
	
	@RequestMapping("/productInventory") 
	public String productInventory(Model model) { 
		List<Product> products = productService.getAllProducts(); 
		
		model.addAttribute("products", products); 
		
		return "productInventory"; 
	}
	
	@RequestMapping("/customer")
	public String manageCustomers(Model model){ 
		 
		 List<Customer> customerList = customerService.getAllCustomers(); 
		
		 model.addAttribute("customerList", customerList); 
		 
		return "customerManagement"; 
		
	}

}
