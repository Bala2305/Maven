package com.testng.feature;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {

	
	@Test
	//@Ignore
	public void LoginDetails() {

	System.out.println("UserID");	
		
	System.out.println("Password");	
		
	}
	
	@Test(dependsOnMethods = "LoginDetails")
	public void Login() {
		System.out.println("LoggedIN");
	}
	
	
}
