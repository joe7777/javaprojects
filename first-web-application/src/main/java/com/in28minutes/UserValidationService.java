package com.in28minutes;

public class UserValidationService {
	
	public boolean isValidateUser(String user, String password) {
		if (user.equals("youssef") && password.equals("asri"))
		return true;
		
		return false;
	}

}
