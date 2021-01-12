package com.hilal.dvdrental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String showIndex(Model theModel) {
		
		theModel.addAttribute("theDate", new java.util.Date());

		return "home";
	}
}
