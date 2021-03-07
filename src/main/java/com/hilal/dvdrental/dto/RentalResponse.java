package com.hilal.dvdrental.dto;


public class RentalResponse {
	
	private final String orderTrackingNumber;
	
	public RentalResponse(String orderTrackingNumber) {
		this.orderTrackingNumber = orderTrackingNumber;
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}
	
	

}
