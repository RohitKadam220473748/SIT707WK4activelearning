package edu.deakin;

public class SimpleLoginForm {

	
	public static String Login (String username, String password) {
		if (!username.equals("testuser"))
			return "user mismatch";
		
		if (!password.equals("testpass"))
			return "password mismatch";
		
		return "success";
	}
}
