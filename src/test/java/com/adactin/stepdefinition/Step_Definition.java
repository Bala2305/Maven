package com.adactin.stepdefinition;

import java.util.Optional;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Test_Runner;
import com.baseclass.Base_Class;
import com.helper.Data_Reader_Manager;
import com.pageObjectManager.PageObjManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Step_Definition extends Base_Class{
	
	public static WebDriver driver = Test_Runner.driver;

	PageObjManager pom = new PageObjManager(driver);
	
	
	
	
	
	@Given("user Launch The Application")
	public void user_launch_the_application() throws Throwable {
		
		String url = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropURL();
	   openUrl(url);
		
		
	}
	
	
	@When("enter The {string} In Username Field")
	public void enter_the_in_username_field(String id) {
		
		//String id = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropID();
				sendInput(pom.getTheLp().getId(), id);
	}
	
	
	
	
	@When("enter The {string} In Password Field")
	public void enter_the_in_password_field(String password) {
		
		//String pass = Data_Reader_Manager.getInstanceDRM().getInstanceDR().getPropPWD();
				sendInput(pom.getTheLp().getPwd(), password);
	}
	
	
	
	
	@Then("user Click On The Login Button And It Navigate To Hotel Search")
public void user_click_on_the_login_button_and_it_navigate_to_hotel_search() throws Throwable {
		
		click(pom.getTheLp().getLogin());

	    
	}

	
}