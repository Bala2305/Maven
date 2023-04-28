package com.testng.feature;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {

	
	
	@BeforeSuite
	public void systemProperty() {
		System.out.println("SystemProperty");
	}
	
	
	
	@BeforeTest
	public void openBrowser() {
		System.out.println("OpenBrowser");
	}
	
	
	
	@BeforeClass
	public void urlLaunch() {
		System.out.println("UrlLaunch");
	}
	
	
	@BeforeMethod
	public void login() {
		System.out.println("LoggedIn");
			}
	
	
	
	@Test(priority = -1)
	public void women() {
System.out.println("Women");
	}
	
	
	@Test
	@Ignore
	public void men() {
		System.out.println("Men");
	}
	
	
	
	@Test (invocationCount = 3)
	public void kids() {
		System.out.println("Kids");
	}
	
	
	@Test(priority = 0)
	public void infants() {
		System.out.println("Infants");
	}
	
	
	@AfterMethod
	public void logout() {
		System.out.println("LoggedOut");
			}
	
	
	
	@AfterClass
	public void closeUrl() {
		System.out.println("CloseUrl");
	}
	
	
	@AfterTest
	public void minimize() {
		System.out.println("Minimize");
	}
	
	
	
	@AfterSuite
	public void quitBrowser() {
		System.out.println("QuitBrowser");
	}
}

