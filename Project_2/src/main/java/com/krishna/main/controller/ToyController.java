package com.krishna.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.krishna.main.beans.Toy;
import com.krishna.main.service.ToyServiceImpl;

import lombok.Getter;
import lombok.Setter;

@Controller
@RequestMapping
public class ToyController {
	
	@Autowired
	@Getter
	@Setter
	private ToyServiceImpl toyServ;
	
	
	
	@PostMapping("/addToy")
	public void addToy(@RequestBody Toy toy) {
		toyServ.addToy(toy);
	}
	
	

}
