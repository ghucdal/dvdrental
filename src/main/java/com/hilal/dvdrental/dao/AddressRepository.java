package com.hilal.dvdrental.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hilal.dvdrental.entity.Address;

public interface AddressRepository extends JpaRepository <Address, Integer>{

}
