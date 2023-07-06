package com.krishna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.entity.User;
import com.krishna.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
		
	}

	@Override
	public void updateUser(User user, int uId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(int uId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUserById(int uId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
