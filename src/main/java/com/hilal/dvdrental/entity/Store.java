package com.hilal.dvdrental.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="store")
public class Store {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="store_id")
	private int id;
	
	@Column(name="manager_staff_id")
	private int managerStaffId;
	
	@Column(name="address_id")
	private int addressId;
	
	public Store() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(int managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	
	

}
