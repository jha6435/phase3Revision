package com.krishna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassOne {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "welcome to thymeleaf");
		return "helloworld";
	}
	
	
	@GetMapping("/hero")
	public String tollywood() {
		return "tamilhero";
	}
	
	@GetMapping("/bollyHero")
	public String bolly(Model m) {
		m.addAttribute("hero", "salman khan");
		m.addAttribute("heroine", "katrina kaif");
		return "bollywoodHero";
	}
	
	@GetMapping("/style")
	public String style() {
		return "add-css-js-demo";
	}
	
	@GetMapping("/bootstrap")
	public String bootstrap() {
		return "add-bootstrap";
	}
}
