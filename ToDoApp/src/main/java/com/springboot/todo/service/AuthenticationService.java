package com.springboot.todo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authenticate(String username, String password) {
		
		 boolean isValidUsername = username.equalsIgnoreCase("root");
		 boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidUsername && isValidPassword;
	}
}
