package edu.deakin;

public class SimpleLoginForm {

	
	public static String Login (String username, String password) {
			
		if(username == null)
			return "Enter username";
		
		if(password == null)
			return "Enter password";
		
		if(!username.equals("rohitkadam"))
			return "Username mismatch";
		
		if (!password.equals("rrk123"))
			return "Password mismatch";
		
		
		
		
		
		return "success";
		
		
	}
}
