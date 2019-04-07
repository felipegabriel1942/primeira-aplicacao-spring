package com.felipe.spring1.services;

import org.springframework.security.core.context.SecurityContextHolder;

import com.felipe.spring1.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		} catch(Exception e) {
			return null;
		}
	}
}
