package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPagePOM {

	public static WebDriver driver;

	public SearchPagePOM(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
		
	}
	
	


	@FindBy(xpath = "//select[@name='location']")
	private WebElement Location;
	
	

	@FindBy(xpath = "//select[@name='hotels']")
	private WebElement Hotel;
	
	
	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement RoomType;
	
	

	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement Roomnos;
	
	
	@FindBy(xpath = "//input[@name='datepick_in']")
	private WebElement checkin;
	
	
	
	@FindBy(xpath = "//input[@name='datepick_out']")
	private WebElement checkout;
	
	

	@FindBy(xpath = "//select[@name='adult_room']")
	private WebElement adults;
	
	
	
	@FindBy(xpath = "//select[@name='child_room']")
	private WebElement child;
	
	
	
	@FindBy(xpath = "//input[@name='Submit']")
	private WebElement search;





	


	



	public WebElement getLocation() {
		return Location;
	}



	public WebElement getHotel() {
		return Hotel;
	}



	public WebElement getRoomType() {
		return RoomType;
	}



	public WebElement getRoomnos() {
		return Roomnos;
	}



	public WebElement getCheckin() {
		return checkin;
	}



	public WebElement getCheckout() {
		return checkout;
	}



	public WebElement getAdults() {
		return adults;
	}



	public WebElement getChild() {
		return child;
	}



	public WebElement getSearch() {
		return search;
	}
	
	
	
	
	
	
}
