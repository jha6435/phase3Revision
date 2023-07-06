package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping(value="/home")
	public String home() {
		System.out.println("this is from home method");
		return "home";
	}

}
