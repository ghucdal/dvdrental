package com.hilal.dvdrental.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.hilal.dvdrental.entity.Film;

public interface FilmRepository extends JpaRepository<Film, Integer>{
	
	//get films by category id
	Page<Film> findByCategories_Id(@RequestParam("id") Integer id, Pageable pageable);
	
	//get films by actor id
	Page<Film> findByActors_Id(@RequestParam("id") Integer id, Pageable pageable);
	
	//search for films by keyword
	//select * from Film f where f.title like concat('%', :title, '%')
	Page<Film> findByTitleContainingIgnoreCase(@RequestParam("title") String title, Pageable pageable);
}
