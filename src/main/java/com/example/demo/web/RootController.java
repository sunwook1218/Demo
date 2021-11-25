package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController { 
	
	@GetMapping({"/", "/home"})
	public String mainPage() {
		
		return "home";
	}
	
	@GetMapping({"/detail"})
	public String detail() {
		
		return "detail";
	}

}
