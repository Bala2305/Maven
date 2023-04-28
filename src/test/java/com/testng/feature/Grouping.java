package com.testng.feature;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping {

	
	
	
	@Test(groups = "fruits")
	public void orange() {
System.out.println("orange");
	}
	
	

	@Test(groups = "fruits")
	public void clementine() {
System.out.println("clementine");
	}
	

	
	@Test(groups = "fruits")
	public void tangrine() {
		System.out.println("tangrine");
	}
	
	

	@Test(groups = "Vegetables")
	public void carrot() {
		System.out.println("carrot");
	}
	
	

	@Test(groups = "Vegetables")
	public void radish() {
		System.out.println("radish");
	}
	
	
	@Test(groups = "Vegetables")
	public void potato() {
		System.out.println("potato");
	}
	

	@Test(groups = "Stationary")
	public void pen() {
		System.out.println("pen");
	}
	
	
	@Test(groups = "Stationary")
	public void pencil() {
		System.out.println("pencil");
	}
	
	
	
	
	@Test(groups = "Stationary")
	public void paper() {
		System.out.println("paper");
	}
}
