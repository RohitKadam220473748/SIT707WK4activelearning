package edu.deakin;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import junit.framework.Assert;

public class SimpleLoginFormTest {
	
	SimpleLoginForm inst;
	@Before
	public void setup() {
	 inst = new SimpleLoginForm();
	 System.out.println("Setup is done");
	}
	
	
	@Test
	public void testNullUsernameandPassword() {
	       String result = inst.Login(null,null);
	       Assert.assertEquals("Enter username", result);
	       System.out.println(result);
	    }
	@Test
	public void testNullUsernameandInvalidPassword() {
	       String result = inst.Login(null,"rght123");
	       Assert.assertEquals("Enter username", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testNullUsernameandValidPassword() {
	       String result = inst.Login(null,"rrk123");
	       Assert.assertEquals("Enter username", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testInvalidUsernameandNullPassword() {
	       String result = inst.Login("rohits",null);
	       Assert.assertEquals("Enter password", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testInvalidUsernameandInvalidPassword() {
	       String result = inst.Login("rrk","rtk123");
	       Assert.assertEquals("Username mismatch", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testInvalidUsernameandValidPassword() {
	       String result = inst.Login("rrk","rrk123");
	       Assert.assertEquals("Username mismatch", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testValidUsernameandNullPassword() {
	       String result = inst.Login("rohitkadam",null);
	       Assert.assertEquals("Enter password", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testValidUsernameandInvalidPassword() {
	       String result = inst.Login("rohitkadam","rk123");
	       Assert.assertEquals("Password mismatch", result);
	       System.out.println(result);
	    }
	
	@Test
	public void testValidUsernameandValidPassword() {
	       String result = inst.Login("rohitkadam","rrk123");
	       Assert.assertEquals("success", result);
	       System.out.println(result);
	    }
	
	
	
	


}
