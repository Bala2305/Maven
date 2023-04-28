package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPage {

	

	public static WebDriver driver;
	
	public HotelPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//input[@name='radiobutton_0']")
	private WebElement button;
	
	public WebElement getButton() {
		return button;
	}

	

	@FindBy(xpath= "//input[@name='continue']")
	private WebElement cont;
	
	public WebElement getCont() {
		return cont;
	}
}
