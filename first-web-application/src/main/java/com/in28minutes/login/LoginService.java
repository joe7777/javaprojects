package com.in28minutes.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("youssef") && password.equalsIgnoreCase("asri");
	}
}
