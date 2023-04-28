package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
     public LoginPage(WebDriver abc) {
		
		this.driver = abc; // for connecting the drivers
		
		PageFactory.initElements(driver, this); // for connecting the web elements
		
		
	}
	
	@FindBy(xpath= "//input[@id='username']")
	private WebElement id;
	
	
	
	@FindBy(xpath= "//input[@id='password']")
	private WebElement pwd;
	
	
	
	@FindBy(xpath= "//input[@id='login']")
	private WebElement login;

	public WebElement getId() {
		return id;
	}



	public WebElement getPwd() {
		return pwd;
	}



	public WebElement getLogin() {
		return login;
	}
	

}
