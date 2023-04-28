package com.runnerclass;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.Base_Class;
import com.helper.Data_Reader_Manager;
import com.pageObjectManager.PageObjManager;
import com.pom.LoginPage;

public class Runner_Class extends Base_Class {

	public static WebDriver driver = Base_Class.openBrowser("chrome");
	
	public static PageObjManager pom = new PageObjManager(driver);

	public static void main(String[] args) throws Throwable {


		String URL = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropURL();
		
		openUrl(URL);
		
		
		
		String ID = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropID();
		
		sendInput(pom.getTheLp().getId(), ID);

		
		
		String PWD = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropPWD();

		sendInput(pom.getTheLp().getPwd(), PWD);

		

		click(pom.getTheLp().getLogin());
		
		

		String location = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getProplocation();
		sDropDown(pom.getTheSp().getLocation(), location);
	
		String hotel = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropHotel();
		sDropDown(pom.getTheSp().getHotel(), hotel);
		
		String roomtype = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropRT();
		sDropDown(pom.getTheSp().getRoomType(), roomtype);
		
		String rooms = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropNOR();
		sDropDown(pom.getTheSp().getRoomnos(), rooms);
		
		
		String checkin = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropCI();
		sendInput(pom.getTheSp().getCheckin(), checkin);
		
		String checkout = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropCO();
		sendInput(pom.getTheSp().getCheckout(), checkout);
		
		String adult = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropAdults();
		sDropDown(pom.getTheSp().getAdults(), adult);
		
		
		String child = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropChild();
		sDropDown(pom.getTheSp().getChild(), child);
		
		click(pom.getTheSp().getSearch());
	
		click(pom.getTheHotel().getButton());
		
		click(pom.getTheHotel().getCont());
		
		
		takeScreenshot(driver, "C:\\Users\\murug\\adactinproject\\MavenProjectForTesting\\Screenshots\\pic1.png");
		
		//quit();
	
	}
	
	
}
