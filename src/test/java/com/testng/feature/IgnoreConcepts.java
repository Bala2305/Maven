package com.testng.feature;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcepts {

	
	
	@Test
	public void orange() {
System.out.println("orange");
	}
	
	

	@Test
	public void clementine() {
System.out.println("clementine");
	}
	

	
	@Test
	public void tangrine() {
		System.out.println("tangrine");
	}
	
	

	@Test
	@Ignore
	public void carrot() {
		System.out.println("carrot");
	}
	
	

	@Test(enabled = false)
	public void radish() {
		System.out.println("radish");
	}
	
	

	@Test
	public void potato() {
		System.out.println("potato");
	}
	
	
	
	
}
