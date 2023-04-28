package com.testng.feature;

import org.testng.annotations.Test;

public class Timeout {
	
	
	
  @Test(timeOut = 4000)
  public void login() throws InterruptedException {
	  
	  Thread.sleep(1000);
	  System.out.println("Browser launch");
	  
	  Thread.sleep(1000);
	  System.out.println("URL Launch");
	  
	  Thread.sleep(1000);
	  System.out.println("Login");

  }
}
