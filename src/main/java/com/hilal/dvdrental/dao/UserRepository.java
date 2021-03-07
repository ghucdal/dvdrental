package com.hilal.dvdrental.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hilal.dvdrental.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
}
