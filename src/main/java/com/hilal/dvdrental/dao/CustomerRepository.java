package com.hilal.dvdrental.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hilal.dvdrental.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
