package com.krishna.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.main.beans.Toy;
import com.krishna.main.repository.ToyRepository;

import lombok.Getter;
import lombok.Setter;

@Service
public class ToyServiceImpl implements ToyService{

	@Autowired
	@Getter
	@Setter
	private ToyRepository toyRepo;
	
	@Override
	public void addToy(Toy toy) {
		toyRepo.save(toy);
		
	}

}
