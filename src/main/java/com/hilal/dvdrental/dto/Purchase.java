package com.hilal.dvdrental.dto;

import java.util.Set;

import com.hilal.dvdrental.entity.Address;
import com.hilal.dvdrental.entity.Customer;
import com.hilal.dvdrental.entity.Order;
import com.hilal.dvdrental.entity.OrderItem;

import lombok.Data;

@Data
public class Purchase {
	
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
