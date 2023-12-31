package com.krishna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/IcinHome")
	public String home() {
		return "IcinHome";
	}

	@GetMapping("/register")
	public String sign() {
		return "register";
	}
	
	@GetMapping("/home")
	public String homeTab() {
		return "home";
	}
	
	@GetMapping("/login")
	public String loginTab() {
		return "login";
	}
	
	@GetMapping("/request")
	public String requestTab() {
		return "request";
	}
	
	@GetMapping("/account")
	public String accountTab() {
		return "account";
	}
	
	@GetMapping("/transfer")
	public String transferTab() {
		return "transfer";
	}
}
