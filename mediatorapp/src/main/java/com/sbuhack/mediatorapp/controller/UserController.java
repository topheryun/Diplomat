package com.sbuhack.mediatorapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sbuhack.mediatorapp.entity.User;
import com.sbuhack.mediatorapp.exception.UserNotFoundException;
import com.sbuhack.mediatorapp.service.UserService;

@RestController
@CrossOrigin(
		allowCredentials = "true",
		origins = "*",
		allowedHeaders = "*",
		methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE, RequestMethod.PUT}
		
		)
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	List<User> all(){
		return userService.getAllUsers();
	}
	
	@PostMapping("/users")
	User newUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/users/{username}")
	User getUser(@PathVariable String username) throws UserNotFoundException{
		return userService.getUser(username);
	}
	
	@PutMapping("/users/{username}")
	User updateMediator(@RequestBody User user, @PathVariable String username) throws UserNotFoundException{
		return userService.updateUser(user, username);
	}
}
