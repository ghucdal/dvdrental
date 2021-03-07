package com.hilal.dvdrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.hilal.dvdrental.dao.UserRepository;

@SpringBootApplication
public class DvdrentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DvdrentalApplication.class, args);
	}

}
