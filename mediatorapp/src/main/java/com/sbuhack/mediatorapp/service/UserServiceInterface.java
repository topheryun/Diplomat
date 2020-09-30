package com.sbuhack.mediatorapp.service;

import java.util.List;

import com.sbuhack.mediatorapp.entity.User;
import com.sbuhack.mediatorapp.exception.UserNotFoundException;

public interface UserServiceInterface {
	User addUser(User user);
	User updateUser(User user,  String username) throws UserNotFoundException;
	User getUser(String username) throws UserNotFoundException;
	void deleteUser(String username)  throws UserNotFoundException;
	List<User> getAllUsers();
}
