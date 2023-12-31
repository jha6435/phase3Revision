package com.krishna.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.krishna.entity.User;

@Controller
public class UserConstroller {
	
	
	@GetMapping("/if-unless")
	public String users(Model model) {
		List<User> users=new ArrayList<>();
		users.add(new User("Rupesh","rupesh@gmail.com","Admin"));
		users.add(new User("rajesh","rajesh@gmail.com","user"));
		users.add(new User("suresh","suresh@gmail.com","user"));
		model.addAttribute("users", users);
		return "if-unless";
	}

	@GetMapping("/switch-case")
	public String switchExample(Model model) {
		User user=new User("Rupesh","rupesh@gmail.com","Admin");
		model.addAttribute("user", user);
		return "switch-case";
	}
	
	
}
