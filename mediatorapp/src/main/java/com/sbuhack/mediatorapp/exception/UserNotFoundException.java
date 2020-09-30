package com.sbuhack.mediatorapp.exception;

public class UserNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public UserNotFoundException(String username) {
		super("Username not found for: " + username);
	}

}
