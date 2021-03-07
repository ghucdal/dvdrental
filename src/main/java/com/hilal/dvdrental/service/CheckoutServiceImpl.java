 package com.hilal.dvdrental.service;

import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hilal.dvdrental.dao.CustomerRepository;
import com.hilal.dvdrental.dto.Purchase;
import com.hilal.dvdrental.dto.PurchaseResponse;
import com.hilal.dvdrental.dto.Rental;
import com.hilal.dvdrental.dto.RentalResponse;
import com.hilal.dvdrental.entity.Customer;
import com.hilal.dvdrental.entity.Order;
import com.hilal.dvdrental.entity.OrderItem;

@Service
public class CheckoutServiceImpl implements CheckoutService {

	private CustomerRepository customerRepository;
	
	@Autowired
	public CheckoutServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	public RentalResponse placeOrder(Rental rental) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		
		Order order = purchase.getOrder();
		
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		Set<OrderItem> orderItems = purchase.getOrderItems();
		orderItems.forEach(item -> order.add(item));
		
		order.setBillingAddress(purchase.getBillingAddress());
		order.setShippingAddress(purchase.getShippingAddress());
		
		Customer customer = purchase.getCustomer();
		customer.add(order);
		
		customerRepository.save(customer);
		
		return new PurchaseResponse(orderTrackingNumber);
	}

	private String generateOrderTrackingNumber() {
		
		return UUID.randomUUID().toString();
		
	}
	
}
