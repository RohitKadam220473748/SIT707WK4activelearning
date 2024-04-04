package edu.deakin;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class SimpleLoginFormTest {
	
	SimpleLoginForm inst;
	@Before
	public void setup() {
	 inst = new SimpleLoginForm();
	 System.out.println("Setup is done");
	}
	
	
	@Test(expected = NullPointerException.class)
	public void testNullUsername(){
		String result = inst.Login(null,null);
		Assert.assertNull(result);
	}
	
	@Test (expected = NullPointerException.class)
	public void BlankUsernameInvalidPassword() {
		String result = inst.Login(null,"pass");
		Assert.assertEquals(result, "testuser", "testpass");
	}
	

}
