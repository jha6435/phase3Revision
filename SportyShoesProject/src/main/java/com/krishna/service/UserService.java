package com.krishna.service;

import java.util.List;

import com.krishna.entity.User;

public interface UserService {
	
	public User addUser(User user);
	public void updateUser(User user,int uId);
	public void deleteUser(int uId);
	public User getUserById(int uId);
	public List<User> getAll();
	

}
