package com.hilal.dvdrental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hilal.dvdrental.entity.Customer;

public interface CustomerService {
	
	public List<Customer> findAll();
	
}
