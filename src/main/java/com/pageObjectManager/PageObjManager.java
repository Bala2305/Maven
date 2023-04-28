package com.pageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pom.HotelPage;
import com.pom.LoginPage;
import com.pom.SearchPagePOM;

public class PageObjManager {

	public static WebDriver driver;

	private LoginPage Lp;
	private SearchPagePOM Sp;
    private HotelPage Hp;
	public PageObjManager(WebDriver driver2) {
		this.driver = driver2;
	}

	
	
	
	
	public LoginPage getTheLp() {

		Lp = new LoginPage(driver);

		return Lp;
	}

	
	
	
	public SearchPagePOM getTheSp() {

		Sp = new SearchPagePOM(driver);
		
		return Sp;
	}

	public HotelPage getTheHotel() {
     Hp = new HotelPage(driver);
     
     return Hp;
	}
	
	
}
