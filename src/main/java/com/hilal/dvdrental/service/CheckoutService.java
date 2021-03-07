package com.hilal.dvdrental.service;

import com.hilal.dvdrental.dto.Purchase;
import com.hilal.dvdrental.dto.PurchaseResponse;
import com.hilal.dvdrental.dto.Rental;
import com.hilal.dvdrental.dto.RentalResponse;

public interface CheckoutService {
	
	RentalResponse placeOrder (Rental rental);
	
	PurchaseResponse placeOrder (Purchase purchase);

}
