package com.hilal.dvdrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hilal.dvdrental.dto.Purchase;
import com.hilal.dvdrental.dto.PurchaseResponse;
import com.hilal.dvdrental.service.CheckoutService;

@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {
	
	private CheckoutService checkoutService;
	
	@Autowired
    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
    
	@PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
    	
    	PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);
    	
    	return purchaseResponse;
    	
    }

}
