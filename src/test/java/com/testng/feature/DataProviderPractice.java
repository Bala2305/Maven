package com.testng.feature;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPractice {
     @Test(dataProvider = "inputData")
    
	  public void login(String username, String password ) {

			System.out.println("Username is "+username);
			
			System.out.println("Password is "+password);
			
			
		}
     
     @DataProvider
     public Object[][] inputData() {

    	return new Object[][] {
    		
    		
    		{"abc","123"},{"qwerty","00000"},{"xyz", "56789"}
    		
    	};
    	 
    	 
	}
  }

