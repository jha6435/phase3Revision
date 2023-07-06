package com.krishna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping(value="/home")
	public String home() {
		System.out.println("this is my home method");
		return "home.jsp";
	}
	
	@RequestMapping("/about")
	public String about(){
		System.out.println("this is about method");
		return "about.jsp";
	}

}
