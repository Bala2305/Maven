package com.testng.feature;

import org.testng.annotations.Test;

public class ExpecterException {
  @Test(expectedExceptions = NullPointerException.class)
  public void add() {
	  
	  int a = 10;
	  System.out.println(a/0);
	  
  }
}
