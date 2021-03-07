package com.hilal.dvdrental.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.hilal.dvdrental.entity.Actor;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

	//get actors by film id
	Page<Actor> findByFilms_Id(@RequestParam("id") Integer id, Pageable pageable);
	
}
