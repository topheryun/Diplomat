package com.sbuhack.mediatorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbuhack.mediatorapp.entity.User;
import com.sbuhack.mediatorapp.exception.UserNotFoundException;
import com.sbuhack.mediatorapp.respository.UserRepository;

@Service
public class UserService implements UserServiceInterface{
	@Autowired
	UserRepository userRepo;
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User updateUser(User user, String username) throws UserNotFoundException {
		User temp_user = userRepo.getOne(username);
		if(temp_user != null) {
			user.setEmail(temp_user.getEmail());
			user.setFirstName(temp_user.getFirstName());
			user.setGender(temp_user.getGender());
			user.setLastName(temp_user.getLastName());
			user.setMiddleName(temp_user.getMiddleName());
			user.setPassword(temp_user.getPassword());
			user.setUsername(temp_user.getUsername());
			user.setMediator(temp_user.isMediator());
			return userRepo.save(user);
		}
		else {
			throw new UserNotFoundException(username);
		}
	}

	@Override
	public User getUser(String username) throws UserNotFoundException {
		User temp_user = userRepo.getOne(username);
		if(temp_user != null) {
			return temp_user;
		}
		else {
			throw new UserNotFoundException(username);
		}
	}

	@Override
	public void deleteUser(String username) throws UserNotFoundException {
		User temp_user = userRepo.getOne(username);
		if(temp_user != null) {
			userRepo.deleteById(username);
		}
		else {
			throw new UserNotFoundException(username);
		}
	}

}
